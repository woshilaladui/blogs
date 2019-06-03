/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BUserController
 * Author:   meng
 * Date:     2018/7/19 10:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.controller.back;

import com.sun.deploy.net.HttpResponse;
import com.wust.job.constant.Constant;
import com.wust.job.entity.Users;
import com.wust.job.entity.UsersInformation;
import com.wust.job.modle.BaseBModle;
import com.wust.job.modle.BaseModle;
import com.wust.job.modle.busers.BUserInformationModle;
import com.wust.job.service.EssayService;
import com.wust.job.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈 后台的用户管理控制器〉
 *人
 * @author meng
 * @create 2018/7/19
 * @since 1.0.0
 */
@Controller
@RequestMapping("/busers")
public class BUserController {




    @Autowired
    private UserService userService;

    @Autowired
    private EssayService essayService;


    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpSession httpSession;



    @RequestMapping("/accountPage")
    public String userMagnerPage(){
        return "account/user";
    }


    @RequestMapping("/getAllUserInf")
    @ResponseBody
    public BUserInformationModle getAllUserInf(){

        String name = request.getParameter("name");

        if(name == null ){

            List<UsersInformation>  usersInformations = userService.getAllUsersInf();
            if(usersInformations != null){
                return new BUserInformationModle(0,"ok",120,usersInformations);
            }
        }else{
            if(name.length() == 0){
                List<UsersInformation>  usersInformations = userService.getAllUsersInf();
                if(usersInformations != null){
                    return new BUserInformationModle(0,"ok",120,usersInformations);
                }
            }
            System.out.println("name = "+name);
            List<UsersInformation> usersInformations = userService.getUserInformationN(name);
            if(usersInformations !=null)
            {
                return new BUserInformationModle(0,"ok",120,usersInformations);
            }
        }

        return null;
    }


    @RequestMapping("/homePage")
    public String homePage(){
        return "account/home";
    }

    @RequestMapping("/essayPage")
    public String essayPage(){
        return "account/essay";
    }

    @RequestMapping("/messagePage")
    public String messagePage(){
        return "account/message";
    }

    @RequestMapping("/heartPage")
    public String heartPage(){
        return "account/heart";
    }

    @RequestMapping("/writingPage")
    public String writingPage(){
        return "account/writing";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public BaseModle deleteUser(){

        /**
         * 先删除Messge表的内容
         * 再删除information表
         * 最后才能删除user表
         */
        String username = request.getParameter("username");
        if(username != null){
            System.out.println("username ="+username);
        }else{
            System.out.println("null username");
            return  new BaseModle(1,"delete error");
        }


        UsersInformation usersInformation = userService.getUserInformation(username);

        System.out.println("wo de id ="+usersInformation.getAccountId());


        if(userService.deleteMessage(usersInformation.getAccountId(),usersInformation.getAccountId())){

        }else {

        }

        if(essayService.deleteMyEssay(username)){

        }else {

        }

        if(userService.deleteInf(username)){

        }else {

        }



        if(userService.deleteUser(username)){
            return new BaseModle(0,"delete success");
        }else {
            return new BaseModle(400,"delete error");
        }

//        //先删除信息表
//        if(userService.deleteMessage(usersInformation.getAccountId(),usersInformation.getAccountId())){
//            //再删除个人信息表
//            if(userService.deleteInf(username)){
//
//                //删除文章表的内容
//                if(essayService.deleteMyEssay(username)){
//                    if(userService.deleteUser(username)){
//                        return new BaseModle(0,"delete success");
//                    }
//                }
//
//            }
//
//        }


//        return new BaseModle(400,"delete error");
    }


    @RequestMapping("/deleteMyEssay")
    public BaseModle deleteMyEssay( ){

        int titleid = Integer.parseInt(request.getParameter("titleid"));
      //  String username = request.getParameter("username");
        System.out.println("deleteMyEssay titleid = "+titleid);

        if(essayService.deleteMyEssayByTitleId(titleid)){
            return new BaseModle(Constant.SUCESS,Constant.DELETE_MYESSAY_SUCCESS,10);
        }
        return new BaseModle(Constant.ERROR,Constant.DELETE_MYESSAY_ERROR,10);



    }


    @RequestMapping("/loginPage")
    public String login(){
        return "account/login";
    }

    @RequestMapping("/login")
    public String doLogin(Users users){
        if (userService.isCanLogin(users)) {
            System.out.println("login success");
            return "account/home";
        }
        System.out.println("login error");
        return "account/login";
    }

}