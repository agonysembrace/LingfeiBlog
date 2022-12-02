package com.lingfei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingfei.mapper.CommentMapper;
import com.lingfei.service.CommentService;
import org.springframework.stereotype.Service;
import com.lingfei.domain.entity.Comment;
/**
 * 评论表(Comment)表服务实现类
 *
 * @author makejava
 * @since 2022-12-02 12:42:02
 */
@Service("commentService")
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
