package com.lingfei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lingfei Wang
 * @version 1.0
 * @date 2022/12/1 16:15
 * @Decription:
 */

@SpringBootApplication
@MapperScan("com.lingfei.mapper")
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }
}
