package com.qian.blog.service;

import com.qian.blog.po.User;

/**
 * @创建人 qianqian
 * @创建时间 2021/3/23
 * @描述
 */
public interface UserService {

    User checkUser(String username, String password);
}
