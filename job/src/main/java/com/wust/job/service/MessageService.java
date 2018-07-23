/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MessageMapper
 * Author:   meng
 * Date:     2018/7/20 9:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.service;

import com.wust.job.entity.Message;
import com.wust.job.mapper.IMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/20
 * @since 1.0.0
 */
@Service
public class MessageService {


    private IMessageMapper messageMapper;


    public MessageService(IMessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    public List<Message> getAllMessage(){
        return  returnMessages(messageMapper.getAllMessage());
    }

    public List<Message> getMyReciveMessage(int sendId){

        return returnMessages(messageMapper.getMyReciveMessage(sendId));
    }

    public List<Message> getMySendMessage(int addressId){
        return returnMessages(messageMapper.getMySendMessage(addressId));
    }


    /**
     * 负责转发的服务
     * @param messages
     * @return
     */
    public List<Message> returnMessages(List<Message> messages){
        if(messages !=null){
            return messages;
        }
        return null;
    }

    public boolean deleteOneMessage(int snedId,int addresseeId){
        System.out.println("snedId = "+snedId);
        System.out.println("addresseeId = "+addresseeId);
        if(messageMapper.deleteOneMessage(snedId,addresseeId)>0){
            return true;
        }
        return false;
    }

    public boolean sendMessage(Message message){
        if(messageMapper.sendMessge(message)>0){
            return true;
        }
        return false;
    }
}