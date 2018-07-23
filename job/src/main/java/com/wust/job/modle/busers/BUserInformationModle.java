/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BUserInformationModle
 * Author:   meng
 * Date:     2018/7/19 10:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.modle.busers;

import com.wust.job.entity.UsersInformation;
import com.wust.job.modle.BaseBModle;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/19
 * @since 1.0.0
 */
public class BUserInformationModle extends BaseBModle {

    public List<UsersInformation> data;


    public BUserInformationModle() {
    }

    public BUserInformationModle(int code, String msg, int count, List<UsersInformation> data) {
        super(code, msg, count);
        this.data = data;
    }


    @Override
    public String toString() {
        return "BUserInformationModle{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                '}';
    }
}