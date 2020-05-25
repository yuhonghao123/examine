package com.example.examine.dao;

import com.example.examine.pojo.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select userId,username,password,mobile_numbers,time from users where username = #{username} and password = #{password}")
    UserPo getByUserNameAndPassword(String username, String password);
}
