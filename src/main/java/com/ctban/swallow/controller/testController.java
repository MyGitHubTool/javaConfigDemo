package com.ctban.swallow.controller;

import com.ctban.swallow.dto.UserDTO;
import com.ctban.swallow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoJie 2018/7/2 12:54
 */
@Controller
@RequestMapping("test")
public class testController {

    @Autowired
    Environment ev;

    @Autowired
    UserService userService;

    @RequestMapping("/findUserInfoByUserId/{id}")
    @ResponseBody
    public List<UserDTO> findUserInfoByUserId(@PathVariable Long id) {
        List<UserDTO> list = new ArrayList<>();
        list.add(userService.findUserInfoId(id));
        return list;
    }


    @RequestMapping("testJsp")
    public String testJsp() {

        return "hello";
    }
}
