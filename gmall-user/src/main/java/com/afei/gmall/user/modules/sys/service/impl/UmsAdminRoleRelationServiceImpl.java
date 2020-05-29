package com.afei.gmall.user.modules.sys.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.user.modules.sys.dao.UmsAdminRoleRelationDao;
import com.afei.gmall.user.modules.sys.entity.UmsAdminRoleRelationEntity;
import com.afei.gmall.user.modules.sys.service.UmsAdminRoleRelationService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
@Service("umsAdminRoleRelationService")
//@org.apache.dubbo.config.annotation.Service(version = "${dubbo.version}")
public class UmsAdminRoleRelationServiceImpl extends ServiceImpl<UmsAdminRoleRelationDao, UmsAdminRoleRelationEntity> implements UmsAdminRoleRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsAdminRoleRelationEntity> page = this.page(
                new Query<UmsAdminRoleRelationEntity>().getPage(params),
                new QueryWrapper<UmsAdminRoleRelationEntity>()
        );

        return new PageUtils(page);
    }

}
