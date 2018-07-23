package com.wust.job.mapper;

import com.wust.job.entity.Essay;
import com.wust.job.entity.Heart;
import com.wust.job.entity.Message;
import com.wust.job.entity.Writing;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IMyWritingMapper {

    @Select("select *from writing")
    public List<Writing> getAllWriting();

    @Select("Select *from writing where username=#{username}")
    public List<Writing> getMyWritingEssay(@Param("username") String username);

    @Select("select *from writing where title=#{title}")
    public List<Writing> getUsersWritingByTitle(@Param("title") String title);

    @Delete("delete from writing where username=#{username}")
    public int deleteMyWriting(String username);

    @Delete("delete from writing where titleid=#{titleid}")
    public int deleteMyWritingByTitleId(int titleid);

    @Insert("insert into writing value (null,#{title},#{username},#{viewCount},#{remarkCount},#{collectCount},#{titleid},#{date})")
    int addWriting(Writing writing);
}
