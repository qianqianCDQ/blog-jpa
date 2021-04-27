package com.qian.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {
    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(BlogApplication.class, args);
    }

}
