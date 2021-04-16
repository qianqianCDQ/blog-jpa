package com.qian.blog.web;

import com.qian.blog.po.Blog;
import com.qian.blog.po.Tag;
import com.qian.blog.po.Type;
import com.qian.blog.service.BlogService;
import com.qian.blog.service.TagService;
import com.qian.blog.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @创建人 qianqian
 * @创建时间 2021/4/8
 * @描述
 */
@Controller
public class TagShowController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private TagService tagService;

    @GetMapping("/tags/{id}")
    public String types(@PageableDefault(size = 8, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                        @PathVariable Long id, Model model) {
        List<Tag> tagList = tagService.listTagTop(10000);
        if (id == -1) {
            id = tagList.get(0).getId();
        }
        model.addAttribute("activeTagId", id);
        model.addAttribute("tags", tagList);
        model.addAttribute("page", blogService.listBlog(id, pageable));
        return "tags";
    }
}
