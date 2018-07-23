/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: PageMessage
 * Author:   meng
 * Date:     2018/7/22 9:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.entity;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/22
 * @since 1.0.0
 */
public class PageMessage {

    public Message message;
    public String addresseeName;//发送方的名字
    public String sendName;//接收方的名字

    public PageMessage() {
    }

    public PageMessage(Message message, String addresseeName, String sendName) {
        this.message = message;
        this.addresseeName = addresseeName;
        this.sendName = sendName;
    }

    @Override
    public String toString() {
        return "PageMessage{" +
                "message=" + message +
                ", addresseeName='" + addresseeName + '\'' +
                ", sendName='" + sendName + '\'' +
                '}';
    }
}