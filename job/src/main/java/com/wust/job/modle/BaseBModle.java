/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BaseBModle
 * Author:   meng
 * Date:     2018/7/19 10:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.modle;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/19
 * @since 1.0.0
 */

/**
 * layui格式的json
 */
public class BaseBModle {

    public int code;
    public String msg;
    public int count;

    public BaseBModle() {
    }

    public BaseBModle(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseBModle(int code, int count) {
        this.code = code;
        this.count = count;
    }

    public BaseBModle(int code, String msg, int count) {
        this.code = code;
        this.msg = msg;
        this.count = count;
    }

    @Override
    public String toString() {
        return "BaseBModle{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                '}';
    }
}