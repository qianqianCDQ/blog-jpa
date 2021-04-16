package com.qian.blog.dao;

import com.qian.blog.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @创建人 qianqian
 * @创建时间 2021/4/7
 * @描述
 */
public interface CommentDao extends JpaRepository<Comment, Long> {

    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
