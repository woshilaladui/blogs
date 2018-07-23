package com.wust.job.mapper;

import com.wust.job.entity.Group;
import com.wust.job.entity.UsersInformation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IGroupMapper {

    @Select("select *from mygroup")
    public List<Group> getAllGroup();

    @Select("select *from mygroup where myname=#{myname}")
    public List<Group> getMyGroup(String myname);


    //删除的时候两边的关系网都要删除
    @Delete("delete from mygroup where myname=#{username} or hisname=#{username}")
    public int deleteOneRealationship(@Param("username") String username);

}
