/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Group
 * Author:   meng
 * Date:     2018/7/22 15:24
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
 * @create 2018/7/22
 * @since 1.0.0
 */
public class Group {

    private int id;
    private String myname;
    private String hisname;
    private String relationship;

    public Group() {
    }

    public Group(int id, String myname, String hisname, String relationship) {
        this.id = id;
        this.myname = myname;
        this.hisname = hisname;
        this.relationship = relationship;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public String getHisname() {
        return hisname;
    }

    public void setHisname(String hisname) {
        this.hisname = hisname;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", myname='" + myname + '\'' +
                ", hisname='" + hisname + '\'' +
                ", relationship='" + relationship + '\'' +
                '}';
    }
}