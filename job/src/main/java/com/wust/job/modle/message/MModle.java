/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MModle
 * Author:   meng
 * Date:     2018/7/22 10:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.modle.message;

import com.wust.job.entity.PageMessage;

import java.io.Serializable;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/22
 * @since 1.0.0
 */
public class MModle implements Serializable {
    List<PageMessage> recives;
    List<PageMessage> sends;

    public MModle() {
    }

    public MModle(List<PageMessage> recives, List<PageMessage> sends) {
        this.recives = recives;
        this.sends = sends;
    }
}