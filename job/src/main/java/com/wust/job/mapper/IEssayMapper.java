package com.wust.job.mapper;

import com.wust.job.entity.Essay;
import com.wust.job.entity.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IEssayMapper {


    @Select("select *from essay")
    public List<Essay> getAllEssay();

    @Select("Select *from essay where username=#{username}")
    public List<Essay> getUsersEssay(@Param("username") String username);

    @Select("select *from essay where title=#{title}")
    public List<Essay> getUsersEssayByTitle(@Param("title") String title);

    @Delete("delete from essay where username=#{username}")
    public int deleteMyEssay(String username);

    @Delete("delete from essay where titleid=#{titleid}")
    public int deleteMyEssayByTitleId(int titleid);


    @Insert("insert into essay value (null,#{title},#{username},#{viewCount},#{remarkCount},#{collectCount},#{titleid},#{date})")
    int addEssay(Essay essay);

}
