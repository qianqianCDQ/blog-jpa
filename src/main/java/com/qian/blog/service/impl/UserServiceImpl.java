package com.qian.blog.service.impl;

import com.qian.blog.dao.UserDao;
import com.qian.blog.po.User;
import com.qian.blog.service.UserService;
import com.qian.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @创建人 qianqian
 * @创建时间 2021/3/23
 * @描述
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
