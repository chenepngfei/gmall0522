package com.afei.gmall.user.modules.sys.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.user.modules.sys.dao.UmsMemberMemberTagRelationDao;
import com.afei.gmall.user.modules.sys.entity.UmsMemberMemberTagRelationEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberMemberTagRelationService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("umsMemberMemberTagRelationService")
//@org.apache.dubbo.config.annotation.Service
public class UmsMemberMemberTagRelationServiceImpl extends ServiceImpl<UmsMemberMemberTagRelationDao, UmsMemberMemberTagRelationEntity> implements UmsMemberMemberTagRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberMemberTagRelationEntity> page = this.page(
                new Query<UmsMemberMemberTagRelationEntity>().getPage(params),
                new QueryWrapper<UmsMemberMemberTagRelationEntity>()
        );

        return new PageUtils(page);
    }

}
