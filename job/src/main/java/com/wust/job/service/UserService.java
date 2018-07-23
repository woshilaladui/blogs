/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserService
 * Author:   meng
 * Date:     2018/7/16 9:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.service;

import com.wust.job.entity.Users;
import com.wust.job.entity.UsersInformation;
import com.wust.job.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author meng
 * @create 2018/7/16
 * @since 1.0.0
 */
@Service
public class UserService {


    private IUserMapper userMapper;

    @Autowired
    public UserService(IUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<UsersInformation> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public List<UsersInformation> getAllUsersInf(){
        return userMapper.getAllUsersInf();
    }


    /**
     * 添加用户基本信息
     *
     * @param usersInformation
     * @return
     */
    public boolean register(UsersInformation usersInformation) {

        if (userMapper.register(usersInformation) > 0) {
            System.out.println("不存在这个用户，可以添加 成功");
            return true;
        } else {
            //失败
            System.out.println("不存在这个用户，可以添加 失败");
            return false;
        }
    }


    /**
     * 返回个人信息详情
     * @param username
     * @return
     */
    public UsersInformation getUserInformation(String username){
        if(userMapper.getUserInformation(username)!=null){
            return userMapper.getUserInformation(username);
        }
        return null;
    }

    public UsersInformation getUserInformation(int accountId){

        UsersInformation usersInformation = userMapper.getUserInformationById(accountId);


        if(usersInformation!=null){
            return usersInformation;
        }

        return null;

    }

    public List<UsersInformation> getUserInformationN(String username){
        if(userMapper.getUserInformation(username)!=null){
            return userMapper.getUserInformationN(username);
        }
        return null;
    }

    /**
     * 是否能登陆
     *
     * @param users
     * @return
     */
    public boolean isCanLogin(Users users) {
        if (isExistUser(users.getUsername())) {
            if (users.getPassword().equals(userMapper.getUser(users.getUsername()).getPassword())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断是否存在该用户
     *
     * @param username
     * @return
     */
    public boolean isExistUser(String username) {
        if (userMapper.getUser(username) != null) {
            return true;
        } else {
            return false;
        }
    }

    public Users getUser(String username){
        return userMapper.getUser(username);
    }

    /**
     * 添加用户账户信息
     *
     * @param users
     * @return
     */
    public boolean addUser(Users users) {
        if (userMapper.addUser(users) > 0)
            return true;
        return false;
    }

    public boolean deleteMessage(int td_sendid,int td_addresseeid){

        System.out.println("td_sendid = "+td_sendid+" td_addresseeid = "+td_addresseeid);

        if(userMapper.deleteUserMessage1(td_sendid)>0){

        }
        if(userMapper.deleteUserMessage2(td_sendid)>0){
            return true;
        }
        return false;
    }


    /**
     * 删除用户信息
     * @param username
     * @return
     */
    public boolean deleteUser(String username){
        System.out.println("username = "+username);
        if(userMapper.deleteUser(username)>0){
            return true;
        }
        return false;
    }

    public boolean deleteInf(String username){
        if(userMapper.deleteUserInf(username)>0){
            return true;
        }
        return false;
    }

    public boolean updateUserInf(UsersInformation usersInformation){
        if(userMapper.updataUserInf(usersInformation)>0){
            return true;
        }
        return false;
    }

}