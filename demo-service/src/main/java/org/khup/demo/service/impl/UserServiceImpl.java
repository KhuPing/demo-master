package org.khup.demo.service.impl;

import org.khup.demo.dao.UserDao;
import org.khup.demo.entity.User;
import org.khup.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }
}
