package com.paul.paul.user;

import com.github.pagehelper.PageInfo;
import com.paul.paul.model.UserVO;

import java.util.Map;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

    int addUser(UserVO user);

    UserVO findById(Map params);

    PageInfo<UserVO> findAllUser(int pageNum, int pageSize);
}
