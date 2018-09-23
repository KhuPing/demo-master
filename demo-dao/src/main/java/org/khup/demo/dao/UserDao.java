package org.khup.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.khup.demo.entity.User;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserDao {

//    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") Long id);
}
