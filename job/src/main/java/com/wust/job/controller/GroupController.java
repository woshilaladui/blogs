/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GroupController
 * Author:   meng
 * Date:     2018/7/22 15:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.controller;

import com.wust.job.modle.BaseModle;
import com.wust.job.modle.group.GroupModle;
import com.wust.job.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author meng
 * @create 2018/7/22
 * @since 1.0.0
 */
@CrossOrigin
@Controller
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @Autowired
    HttpServletRequest request;


    @RequestMapping("/getAllGroup")
    @ResponseBody
    public GroupModle getAllGroup() {
        return new GroupModle(
                0,
                "得到全部分组信息成功",
                10, groupService.
                getAllGroup());
    }


    @RequestMapping(value = "/getMyGroup",method = RequestMethod.GET)
    @ResponseBody
    public GroupModle getMyGroup(String username) {
        return new GroupModle(
                0,
                "得到全部分组信息成功",
                10, groupService.
                getMyGroup(username));
    }


    /**
     * 删除的时候要两边的关系网都要删除
     * @param username
     * @return
     */
    @RequestMapping("/deleteOneRealationship")
    @ResponseBody
    public BaseModle deleteOneRealationship( ){

        String username = request.getParameter("hisname");
        System.out.println("deleteOneRealationship "+username);
        if(groupService.deleteOneRealationship(username)){
            return new BaseModle(
                    0,
                    "删除成功",
                    10);
        }
        return new BaseModle(
                1,
                "删除失败",
                0
                );
    }

}