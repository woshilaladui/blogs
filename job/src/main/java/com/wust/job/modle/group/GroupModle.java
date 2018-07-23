/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GroupModle
 * Author:   meng
 * Date:     2018/7/22 15:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.modle.group;

import com.wust.job.entity.Group;
import com.wust.job.modle.BaseModle;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/22
 * @since 1.0.0
 */
public class GroupModle extends BaseModle {

    public List<Group> data;

    public GroupModle() {
    }

    public GroupModle(int code, String msg, int count, List<Group> data) {
        super(code, msg, count);
        this.data = data;
    }
}