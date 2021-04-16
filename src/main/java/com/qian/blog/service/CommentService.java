package com.qian.blog.service;

import com.qian.blog.po.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 qianqian
 * @创建时间 2021/4/7
 * @描述
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
