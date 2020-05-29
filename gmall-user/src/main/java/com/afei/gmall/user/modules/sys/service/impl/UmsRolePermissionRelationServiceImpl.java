package com.afei.gmall.user.modules.sys.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.user.modules.sys.entity.UmsRolePermissionRelationEntity;
import com.afei.gmall.user.modules.sys.dao.UmsRolePermissionRelationDao;
import com.afei.gmall.user.modules.sys.service.UmsRolePermissionRelationService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
@Service("umsRolePermissionRelationService")
//@org.apache.dubbo.config.annotation.Service
public class UmsRolePermissionRelationServiceImpl extends ServiceImpl<UmsRolePermissionRelationDao, UmsRolePermissionRelationEntity> implements UmsRolePermissionRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsRolePermissionRelationEntity> page = this.page(
                new Query<UmsRolePermissionRelationEntity>().getPage(params),
                new QueryWrapper<UmsRolePermissionRelationEntity>()
        );

        return new PageUtils(page);
    }

}
