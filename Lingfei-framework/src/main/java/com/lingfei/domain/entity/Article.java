package com.lingfei.domain.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Article)表实体类
 *
 * @author makejava
 * @since 2022-12-01 18:15:29
 */
@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("lingfei_blog")
public class Article {
    
    private Integer id;
    
    private String title;
    
    private String content;
    
    private String summary;
    
    private Long categoryId;
    
    private String thumbnail;
    
    private String isTop;
    
    private String status;
    
    private Long viewCount;
    
    private String isComment;
    
    private Long createBy;
    
    private Date createTime;
    
    private Integer updateBy;
    
    private Date updateTime;
    
    private Integer delFlag;


}

