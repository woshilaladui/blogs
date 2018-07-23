/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MessageController
 * Author:   meng
 * Date:     2018/7/20 9:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.controller;

import com.wust.job.entity.Message;
import com.wust.job.entity.PageMessage;
import com.wust.job.modle.BaseModle;
import com.wust.job.modle.message.BaseMessageModle;
import com.wust.job.modle.message.MModle;
import com.wust.job.modle.message.MessageModle;
import com.wust.job.modle.message.PageMessageModle;
import com.wust.job.service.MessageService;
import com.wust.job.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author meng
 * @create 2018/7/20
 * @since 1.0.0
 */
@CrossOrigin
@RequestMapping("/message")
@Controller
public class MessageController {

    private int td_id;
    private int td_addresseeid;
    private String td_content;
    private int delete_flag;
    private int td_sendid;
    private Date time;

    @Autowired
    UserService userService;

    @Autowired
    private MessageService messageService;


    @Autowired
    private HttpServletRequest request;


    @RequestMapping("/addMessagePage")
    public String messagePage() {
        return "account/addMessage";
    }


    @RequestMapping("/getAllMessage")
    @ResponseBody
    public MessageModle getAllMessages() {
        List<Message> messages = messageService.getAllMessage();
        System.out.println(messages.toString());
        if (messages != null) {
            return new MessageModle(
                    0,
                    "get all message success",
                    100,
                    messages);
        }
        return new MessageModle(
                1,
                "get all message error",
                0,
                messages);
    }

//    @RequestMapping("/getMyReciveMessage")
//    @ResponseBody
//    public PageMessageModle getMyReciveMessage(int sendId) {
//        List<Message> messages = messageService.getMyReciveMessage(sendId);
//
//        List<PageMessage> pageMessages = new ArrayList<>();
//        //遍历这个消息集合去构造页面的消息集合
//        for (Message message : messages) {
//            String addressName = userService.getUserInformation( message.getTd_addresseeid()).getUsername();
//            pageMessages.add(new PageMessage(message,addressName,null));
//        }
//
//        if (pageMessages != null) {
//            return new PageMessageModle(0,
//                    "get my recive pagemessage success",
//                    10,
//                    new BaseMessageModle( pageMessages,null));
//        }
//        return new PageMessageModle(
//                1,
//                "get my recive pagemessage error",
//                0,
//                null);
//    }

//    @RequestMapping("/getMySendMessage")
//    @ResponseBody
//    public MessageModle getMySendMessage(int addressId) {
//        List<Message> messages = messageService.getMySendMessage(addressId);
//
//    }

    @RequestMapping(value = "/getPageMessage",method = RequestMethod.GET)
    @ResponseBody
    //得到我自己的发送信息和接收信息
    public PageMessageModle getMyPageMessage(String username){


        System.out.println("getMyPageMessage  username"+username);

        int coundId = userService.getUserInformation(username).getAccountId();

        System.out.println("getMyPageMessage coundId = "+coundId);
        List<Message> recives = messageService.getMyReciveMessage(coundId);
        List<PageMessage> pageReciveMessages = new ArrayList<>();
        List<Message> sends = messageService.getMySendMessage(coundId);
        List<PageMessage> pageSendMessage = new ArrayList<>();

        //循环构造页面的接收者的信息集合
        for(Message message:recives){
            //遍历拿到该发送的人
            String addressName = userService.getUserInformation( message.getTd_addresseeid()).getUsername();
            String sendName = userService.getUserInformation(message.getTd_sendid()).getUsername();
            pageReciveMessages.add(new PageMessage(message,addressName,sendName));
        }
        System.out.println("pageReciveMessages"+pageReciveMessages.toString());
        for(Message message:sends){
            String addressName = userService.getUserInformation( message.getTd_addresseeid()).getUsername();
            String sendName = userService.getUserInformation(message.getTd_sendid()).getUsername();

            pageSendMessage.add(new PageMessage(message,addressName,sendName));
        }
        System.out.println("pageSendMessage"+pageSendMessage.toString());



        BaseMessageModle base = new BaseMessageModle(pageReciveMessages,pageSendMessage);

        return new PageMessageModle(
                0,
                "获取成功",
                10,
                base);
    }


    @ResponseBody
    @RequestMapping("/deleteMyMessage")
    public BaseModle deleteMyMessage() {
        int td_addresseeid = Integer.parseInt(request.getParameter("td_addresseeid"));
        int td_sendid = Integer.parseInt(request.getParameter("td_sendid"));

        if (messageService.deleteOneMessage(td_sendid, td_addresseeid)) {
            return new BaseModle(0, "删除信息成功", 10);
        }


        return new BaseModle(1, "删除信息失败", 0);

    }

    @RequestMapping("/sendMessage")
    @ResponseBody
    public BaseModle sendMessage() {
        String content = request.getParameter("content");
        String username = request.getParameter("username");

        if (!userService.isExistUser(username))
            return new BaseModle(1, "发送信息失败,该用户不存在", 0);

        if (messageService.sendMessage(new Message(
                0,
                1000,
                content,
                0,
                userService.getUserInformation(username).getAccountId(),
                new Date()))) {
            return new BaseModle(1, "发送信息成功", 10);
        }

        return new BaseModle(1, "发送信息失败", 0);
    }


}