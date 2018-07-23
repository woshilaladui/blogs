/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Message
 * Author:   meng
 * Date:     2018/7/20 9:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.entity;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 * 实际存储的Message
 * @author meng
 * @create 2018/7/20
 * @since 1.0.0
 */
public class Message {
    private int td_id;
    private int td_addresseeid;
    private String td_content;
    private int delete_flag;
    private int td_sendid;
    private Date time;

    public Message() {
    }

    public Message(int td_id, int td_addresseeid, String td_content, int delete_flag, int td_sendid, Date time) {
        this.td_id = td_id;
        this.td_addresseeid = td_addresseeid;
        this.td_content = td_content;
        this.delete_flag = delete_flag;
        this.td_sendid = td_sendid;
        this.time = time;
    }

    public int getTd_id() {
        return td_id;
    }

    public void setTd_id(int td_id) {
        this.td_id = td_id;
    }

    public int getTd_addresseeid() {
        return td_addresseeid;
    }

    public void setTd_addresseeid(int td_addresseeid) {
        this.td_addresseeid = td_addresseeid;
    }

    public String getTd_content() {
        return td_content;
    }

    public void setTd_content(String td_content) {
        this.td_content = td_content;
    }

    public int getDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(int delete_flag) {
        this.delete_flag = delete_flag;
    }

    public int getTd_sendid() {
        return td_sendid;
    }

    public void setTd_sendid(int td_sendid) {
        this.td_sendid = td_sendid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Message{" +
                "td_id=" + td_id +
                ", td_addresseeid=" + td_addresseeid +
                ", td_content='" + td_content + '\'' +
                ", delete_flag=" + delete_flag +
                ", td_sendid=" + td_sendid +
                ", time=" + time +
                '}';
    }
}