package com.paul.paul.dao;



import com.paul.paul.model.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {


    int insert(UserVO record);

    UserVO findById(Map params);

    List<UserVO> selectUsers();
}