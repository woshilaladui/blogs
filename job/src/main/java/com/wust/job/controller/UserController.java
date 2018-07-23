/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserController
 * Author:   meng
 * Date:     2018/7/16 9:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.controller;

import com.wust.job.entity.Users;
import com.wust.job.entity.UsersInformation;
import com.wust.job.modle.BaseModle;
import com.wust.job.modle.users.UserInformationModle;
import com.wust.job.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author meng
 * @create 2018/7/16
 * @since 1.0.0
 */
@CrossOrigin
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    HttpSession httpSession;

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/getUsers")
    @ResponseBody
    public List<UsersInformation> getAllUsers() {
        List<UsersInformation> users = userService.getAllUsers();
        for (UsersInformation u : users) {
            System.out.println(u.toString());

        }
        return users;
    }

    @RequestMapping("/get")
    @ResponseBody
    public UsersInformation getUsers() {
        List<UsersInformation> users = userService.getAllUsers();
        System.out.println("getUsers");
        return users.get(0);
    }


    @RequestMapping("/mypage")
    public String getMyPage() {
        return "mypage";
    }

    @RequestMapping("/ajax")
    @ResponseBody
    public String testAjax(int num) {
        System.out.println(num);
        return "ok";
    }


    /**
     * 注册界面的信息，填完基本信息后
     * 如果这个用户不存在的时候
     * 先插入到user表
     * 再插入到user_information表
     *
     * @param username
     * @param role
     * @param nickName
     * @param sex
     * @param mail
     * @param password
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    @ResponseBody
    public BaseModle rgister(
            String username,
            String role,
            String nickName,
            String sex,
            String mail,
            String password) {

        System.out.println("register");
        System.out.println("username = "+username);
        System.out.println("role = "+role);
        System.out.println("nickName = "+nickName);
        System.out.println("sex = "+sex);
        System.out.println("mail = "+mail);
        System.out.println("password = "+password);
        Users users = new Users(username, password);
        int accountId = new Random().nextInt(100000);

        UsersInformation usersInformation = new UsersInformation(
                username,
                accountId,
                sex,
                mail,
                nickName,
                role
        );

        //存在这个用户则不能添加该用户
        if (userService.isExistUser(username)) {
            return new BaseModle(1, "error 该用户已经存在");
        } else {
            //若成功加入的时候再添加用户基本信息
            if (userService.addUser(users)) {
                if (userService.register(usersInformation)) {
                    return new BaseModle(0, "success 添加成功");
                } else {
                    /**
                     * 这里用来处理回滚，user表成功插入，但是user_information表
                     * 未能成功插入，所以还是添加失败，则应该吧user表的用户给删除掉
                     */
                    return new BaseModle(200, "error （回滚数据） 添加失败");
                }
            } else {//用户添加失败
                return new BaseModle(200, "error 添加失败");
            }
        }//end else
    }

    @RequestMapping("/login")
    @ResponseBody
    public BaseModle login(Users users) {

        if (userService.isCanLogin(users)) {
            System.out.println("login success");
            return new BaseModle(0, "ok");
        }
        System.out.println("login error");
        return new BaseModle(1, "error 账号或密码错误");
    }

    @RequestMapping("/getInformation")
    @ResponseBody
    public UserInformationModle getUserInformation(String username) {

        System.out.println("getUserInformation  "+username);
        if (userService.getUserInformation(username) != null) {
            System.out.println("getUserInformation  success");
            System.out.println("getUserInformation"+userService.getUserInformation(username).toString());
            return new UserInformationModle(
                    200,
                    "getUserInformation success",
                    userService.getUserInformation(username)
            );

        }
        return new UserInformationModle(
                400,
                "getUserInformation error",
                null
        );
    }


    /**
     * 涉及到用户账户的信息要用post请求
     * @param =
     * @return
     */
    @RequestMapping("/updateUserInf")
    @ResponseBody
    public BaseModle updateUserInf(){

        String username = request.getParameter("username");
        String nickName = request.getParameter("nickName");

        UsersInformation usersInformation = userService.getUserInformation(username);
        usersInformation.setNickName(nickName);

        if(userService.updateUserInf(usersInformation)){
            return new BaseModle(
                    0,
                    "更新成功",
                    10);
        }

        return new BaseModle(1,
                "更新失败",
                0);
    }


}