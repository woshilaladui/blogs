/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: IMyHeartMapper
 * Author:   meng
 * Date:     2018/7/21 9:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.mapper;

import com.wust.job.entity.Essay;
import com.wust.job.entity.Heart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/21
 * @since 1.0.0
 */
@Component
public interface IMyHeartMapper {

    @Select("select *from heart")
    List<Heart> getAllHeart();

    @Select("Select *from heart where username=#{username}")
    public List<Heart> getUsersHeart(@Param("username") String username);

    @Select("select *from heart where title=#{title}")
    public List<Heart> getUsersHeartByTitle(@Param("title") String title);

    @Delete("delete from heart where username=#{username}")
    int deleteMyHeart(String username);

    @Delete("delete from heart where titleid=#{titleid}")
    public int deleteMyHeartByTitleId(int titleid);

    @Insert("insert into heart value (null,#{title},#{username},#{viewCount},#{remarkCount},#{collectCount},#{titleid},#{date})")
    int addHeart(Heart heart);

}