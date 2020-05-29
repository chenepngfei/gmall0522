package com.afei.gmall.user.modules.sys.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.user.modules.sys.dao.UmsMemberTagDao;
import com.afei.gmall.user.modules.sys.entity.UmsMemberTagEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberTagService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("umsMemberTagService")
//@org.apache.dubbo.config.annotation.Service
public class UmsMemberTagServiceImpl extends ServiceImpl<UmsMemberTagDao, UmsMemberTagEntity> implements UmsMemberTagService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberTagEntity> page = this.page(
                new Query<UmsMemberTagEntity>().getPage(params),
                new QueryWrapper<UmsMemberTagEntity>()
        );

        return new PageUtils(page);
    }

}
