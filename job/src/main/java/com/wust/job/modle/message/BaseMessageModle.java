/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BaseMessageModle
 * Author:   meng
 * Date:     2018/7/22 9:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.modle.message;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author meng
 * @create 2018/7/22
 * @since 1.0.0
 */


import com.wust.job.entity.PageMessage;

import java.io.Serializable;
import java.util.List;

/**
 * 包括自己发送的信息，和自己接收的信息
 */
public class BaseMessageModle implements Serializable {

    public List<PageMessage> recives;
    public List<PageMessage> sends;

    public BaseMessageModle() {
    }

    public BaseMessageModle(List<PageMessage> recives, List<PageMessage> sends) {
        this.recives = recives;
        this.sends = sends;
    }

    @Override
    public String toString() {
        return "BaseMessageModle{" +
                "recives=" + recives +
                ", sends=" + sends +
                '}';
    }
}