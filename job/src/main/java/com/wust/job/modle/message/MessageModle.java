/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MessageModle
 * Author:   meng
 * Date:     2018/7/20 9:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.modle.message;

import com.wust.job.entity.Message;
import com.wust.job.modle.BaseModle;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/20
 * @since 1.0.0
 */
public class MessageModle extends BaseModle {

    public List<Message> data;

    public MessageModle() {
    }

    public MessageModle(int eocde, String emsg, List<Message> data) {
        super(eocde, emsg);
        this.data = data;
    }

    public MessageModle(int code, String msg, int count, List<Message> data) {
        super(code, msg, count);
        this.data = data;
    }

    @Override
    public String toString() {
        return "MessageModle{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                '}';
    }
}