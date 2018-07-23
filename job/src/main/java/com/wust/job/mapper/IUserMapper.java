package com.wust.job.mapper;

import com.wust.job.entity.Users;
import com.wust.job.entity.UsersInformation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IUserMapper {


    //查询所有用户信息
    @Select("select *from users")
    public List<UsersInformation> getAllUsers();

    /**
     *
     * @return
     */
//    @Select("select *from users where username=#{username}")
//    public Users getUser(Users users);

    @Insert("insert into users_information value(null,#{username},#{accountId},#{age},#{sex},#{mail},#{nickName},#{role})")
    public int register(UsersInformation usersInformation);

    @Select("select *from users where username=#{username}")
    public Users getUser(String username);

    @Insert("insert into users value (null,#{username},#{password})")
    public int addUser(Users users);

    @Delete("delete from users where username=#{username}")
    public int deleteUser(String username);

    @Delete("delete from users_information where username=#{username}")
    public int deleteUserInf(String username);


    @Delete("delete from td_message WHERE td_sendid=#{td_sendid}")
    public int deleteUserMessage1(int td_sendid);

    @Delete("delete from td_message WHERE td_addresseeid=#{td_addresseeid}")
    public int deleteUserMessage2(int td_addresseeid);


    @Select("select *from users_information where username=#{username}")
    public UsersInformation getUserInformation(String username);

    @Select("select *from users_information where accountId=#{accountId}")
    public UsersInformation getUserInformationById(int accountId);

    @Select("select *from users_information where username=#{username}")
    public List<UsersInformation> getUserInformationN(String username);

    @Select("select *from users_information")
    public List<UsersInformation> getAllUsersInf();

    @Update("Update users_information set nickName=#{nickName} ,age=#{age} where username=#{username}")
    public int updataUserInf(UsersInformation usersInformation);
}
