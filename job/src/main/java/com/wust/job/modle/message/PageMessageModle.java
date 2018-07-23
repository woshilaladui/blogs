/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: PageMessageModle
 * Author:   meng
 * Date:     2018/7/22 9:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.modle.message;

import com.wust.job.modle.BaseModle;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *页面信息返回数据的格式
 * @author meng
 * @create 2018/7/22
 * @since 1.0.0
 */
public class PageMessageModle extends BaseModle {

    public BaseMessageModle data;

    public PageMessageModle() {
    }


    public PageMessageModle(int code, String msg, int count, BaseMessageModle data) {
        super(code, msg, count);
        this.data = data;
    }
}