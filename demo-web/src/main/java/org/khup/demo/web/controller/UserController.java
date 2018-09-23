package org.khup.demo.web.controller;

import org.khup.demo.dao.UserDao;
import org.khup.demo.entity.User;
import org.khup.demo.service.UserService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }

}
