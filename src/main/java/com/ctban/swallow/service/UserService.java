package com.ctban.swallow.service;

import com.ctban.swallow.dto.UserDTO;

/**
 * @author GuoJie 2018/7/2 15:29
 */
public interface UserService {

    /**
     * 查询用户的信息
     *
     * @param userId
     * @return
     */
    UserDTO findUserInfoByUserId(String userId);
}
