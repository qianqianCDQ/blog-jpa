package com.qian.blog.service;

import com.qian.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @创建人 qianqian
 * @创建时间 2021/3/25
 * @描述
 */
public interface TypeService {

    Type saveType(Type type);
    Type getType(Long id);
    Page<Type> listType(Pageable page);
    List<Type> listType();
    List<Type> listTypeTop(Integer size);
    Type updateType(Long id, Type type);
    void deleteType(Long id);
    Type getTypeByName(String name);
}
