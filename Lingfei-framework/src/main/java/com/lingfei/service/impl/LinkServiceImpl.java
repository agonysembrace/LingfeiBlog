package com.lingfei.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingfei.constants.SystemConstants;
import com.lingfei.domain.ResponseResult;
import com.lingfei.domain.vo.LinkVo;
import com.lingfei.mapper.LinkMapper;
import com.lingfei.service.LinkService;
import com.lingfei.utils.BeanCopyUtils;
import org.springframework.stereotype.Service;
import com.lingfei.domain.entity.Link;

import java.util.List;

/**
 * 友链(Link)表服务实现类
 *
 * @author makejava
 * @since 2022-12-02 12:42:02
 */
@Service("linkService")
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements LinkService {

    @Override
    public ResponseResult getAllLink() {
        LambdaQueryWrapper<Link> queryWrapper = new LambdaQueryWrapper();
        //只能显示审核被通过的友链
        queryWrapper.eq(Link ::getStatus, SystemConstants.LINK_STATUS_NORMAL);
        //获取符合wrapper查询条件的所有link组成List
        List<Link> links  = list(queryWrapper);
        //转换为Vo
        List<LinkVo> linkVos = BeanCopyUtils.copyBeanList(links, LinkVo.class);
        return ResponseResult.okResult(linkVos);
    }
}
