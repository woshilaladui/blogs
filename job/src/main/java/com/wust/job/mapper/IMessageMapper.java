package com.wust.job.mapper;

import com.wust.job.entity.Message;
import com.wust.job.entity.Writing;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IMessageMapper {

    @Select("select *from td_message")
    public List<Message> getAllMessage();

    @Select("select *from td_message where td_sendid=#{td_sendid}")
    public List<Message> getMyReciveMessage(int sendId);

    @Select("select *from td_message where td_addresseeid=#{td_addresseeid}")
    public List<Message> getMySendMessage(int td_addresseeid);

    @Delete("delete from td_message where td_sendid=#{td_sendid} and td_addresseeid=#{td_addresseeid}")
    public int deleteOneMessage(@Param("td_sendid") int td_sendid, @Param("td_addresseeid")int  td_addresseeid);


    @Insert("insert into writing value (null,#{title},#{username},#{viewCount},#{remarkCount},#{collectCount},#{titleid},#{date})")
    int addWriting(Writing writing);


    //发送信息
    @Insert("insert into td_message value(null,#{td_addresseeid},#{td_content},#{delete_flag},#{td_sendid},#{time})")
    int sendMessge(Message message);

}
