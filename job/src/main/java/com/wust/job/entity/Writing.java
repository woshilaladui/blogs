/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Writing
 * Author:   meng
 * Date:     2018/7/20 16:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.entity;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/20
 * @since 1.0.0
 */
public class Writing {
    private int id;
    private String title;
    private String username;
    private int viewCount;
    private int remarkCount;
    private int collectCount;
    private int titleid;
    private Date date;

    public Writing() {
    }

    /**
     *
     * @param id
     * @param title
     * @param username
     * @param viewCount
     * @param remarkCount
     * @param collectCount
     * @param titleid
     * @param date
     */
    public Writing(int id,
                 String title,
                 String username,
                 int viewCount,
                 int remarkCount,
                 int collectCount,
                 int titleid,
                 Date date
    ) {
        this.id = id;
        this.title = title;
        this.username = username;
        this.viewCount = viewCount;
        this.remarkCount = remarkCount;
        this.collectCount = collectCount;
        this.titleid = titleid;
        this.date = date;
    }


    @Override
    public String toString() {
        return "Essay{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", username='" + username + '\'' +
                ", viewCount=" + viewCount +
                ", remarkCount=" + remarkCount +
                ", collectCount=" + collectCount +
                ", titleid=" + titleid +
                ", date=" + date +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getRemarkCount() {
        return remarkCount;
    }

    public void setRemarkCount(int remarkCount) {
        this.remarkCount = remarkCount;
    }

    public int getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(int collectCount) {
        this.collectCount = collectCount;
    }

    public int getTitleid() {
        return titleid;
    }

    public void setTitleid(int titleid) {
        this.titleid = titleid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}