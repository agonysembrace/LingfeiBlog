package com.lingfei.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingfei.domain.ResponseResult;
import com.lingfei.domain.entity.Article;
import com.lingfei.domain.vo.HotArticleVo;
import com.lingfei.mapper.ArticleMapper;

import com.lingfei.service.ArticleService;
import com.lingfei.utils.BeanCopyUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingfei Wang
 * @version 1.0
 * @date 2022/12/1 16:43
 * @Decription:
 */

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
    @Override
    public ResponseResult hotArticleList() {
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Article ::getStatus,0);
        queryWrapper.orderByDesc(Article::getViewCount);
        Page<Article> page = new Page<>();
        page(page,queryWrapper);


//        List<HotArticleVo> articleVos = new ArrayList<>();
        List<Article> articles = page.getRecords();
//        for(Article article : articles){
//            HotArticleVo hotArticleVo = new HotArticleVo();
//            BeanUtils.copyProperties(article, hotArticleVo);
//            articleVos.add(hotArticleVo);
//        }
        List<HotArticleVo> articleVos = BeanCopyUtils.copyBeanList(articles,HotArticleVo.class);

        return ResponseResult.okResult(articleVos);
    }
}
