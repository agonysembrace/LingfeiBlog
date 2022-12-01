package com.lingfei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lingfei.domain.ResponseResult;
import com.lingfei.domain.entity.Article;

/**
 * @author lingfei Wang
 * @version 1.0
 * @date 2022/12/1 16:44
 * @Decription:
 */
public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();
}
