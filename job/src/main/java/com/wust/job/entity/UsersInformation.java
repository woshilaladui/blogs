/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UsersInformation
 * Author:   meng
 * Date:     2018/7/16 9:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.entity;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/16
 * @since 1.0.0
 */
public class UsersInformation {

    private int id;

    private String username;

    private int accountId;

    private int age;

    private String sex;

    private String mail;

    private String nickName;

    private String role;

    public UsersInformation() {
    }

    public UsersInformation(String username,
                            String sex,
                            String mail,
                            String nickName,
                            String role) {
        this.username = username;
        this.sex = sex;
        this.mail = mail;
        this.nickName = nickName;
        this.role = role;
    }

    public UsersInformation(String username, int accountId, String sex, String mail, String nickName, String role) {
        this.username = username;
        this.accountId = accountId;
        this.sex = sex;
        this.mail = mail;
        this.nickName = nickName;
        this.role = role;
    }

    @Override
    public String toString() {
        return "UsersInformation{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", accountId=" + accountId +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", mail='" + mail + '\'' +
                ", nickName='" + nickName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}