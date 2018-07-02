package com.ctban.swallow.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author GuoJie 2018/7/2 15:26
 */
public class UserDTO implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 年龄
     */
    private Integer age;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
