package com.afei.gmall.user.modules.sys.service.impl;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.common.utils.Query;
import com.afei.gmall.user.modules.sys.dao.UmsAdminPermissionRelationDao;
import com.afei.gmall.user.modules.sys.entity.UmsAdminPermissionRelationEntity;
import com.afei.gmall.user.modules.sys.service.UmsAdminPermissionRelationService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("umsAdminPermissionRelationService")
public class UmsAdminPermissionRelationServiceImpl extends ServiceImpl<UmsAdminPermissionRelationDao, UmsAdminPermissionRelationEntity> implements UmsAdminPermissionRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsAdminPermissionRelationEntity> page = this.page(
                new Query<UmsAdminPermissionRelationEntity>().getPage(params),
                new QueryWrapper<UmsAdminPermissionRelationEntity>()
        );

        return new PageUtils(page);
    }

}
