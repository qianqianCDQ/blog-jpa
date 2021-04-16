package com.qian.blog.service;

import com.qian.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @创建人 qianqian
 * @创建时间 2021/3/25
 * @描述
 */
public interface TagService {

    Tag saveTag(Tag tag);
    Tag getTag(Long id);
    Page<Tag> listTag(Pageable page);
    List<Tag> listTag();
    List<Tag> listTag(String ids);
    List<Tag> listTagTop(Integer size);
    Tag updateTag(Long id, Tag tag);
    void deleteTag(Long id);
    Tag getTagByName(String name);
}
