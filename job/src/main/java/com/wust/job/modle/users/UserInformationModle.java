/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserInformationModle
 * Author:   meng
 * Date:     2018/7/17 9:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.modle.users;

import com.wust.job.entity.UsersInformation;
import com.wust.job.modle.BaseModle;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/17
 * @since 1.0.0
 */
public class UserInformationModle extends BaseModle {

    public UsersInformation data;

    public UserInformationModle() {
    }

    public UserInformationModle(int eocde, String emsg, UsersInformation data) {
        super(eocde, emsg);
        this.data = data;
    }


}