package com.ctban.swallow.mapper;

import com.ctban.swallow.dto.UserDTO;

/**
 * @author GuoJie 2018/7/2 15:33
 */
public interface UserDao {
    /**
     * 查询用户信息
     *
     * @param userId
     * @return
     */
    UserDTO findUserInfoByUserId(String userId);
}
