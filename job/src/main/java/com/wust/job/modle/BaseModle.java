/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BaseModle
 * Author:   meng
 * Date:     2018/7/17 9:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.modle;

/**
 * 〈json封装的基类
 *
 *   其他json的实体类必须继承该类
 * 〉<br>
 * 〈〉
 *
 * @author meng
 * @create 2018/7/17
 * @since 1.0.0
 */
public class BaseModle {

    public int code;
    public String msg;
    public int count;

    public BaseModle() {
    }

    public BaseModle(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseModle(int code, String msg, int count) {
        this.code = code;
        this.msg = msg;
        this.count = count;
    }
}