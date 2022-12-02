package com.lingfei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingfei.mapper.TagMapper;
import com.lingfei.service.TagService;
import org.springframework.stereotype.Service;
import com.lingfei.domain.entity.Tag;
/**
 * 标签(Tag)表服务实现类
 *
 * @author makejava
 * @since 2022-12-02 12:42:02
 */
@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}
