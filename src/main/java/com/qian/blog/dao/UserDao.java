package com.qian.blog.dao;

import com.qian.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @创建人 qianqian
 * @创建时间 2021/3/23
 * @描述
 */
public interface UserDao extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
