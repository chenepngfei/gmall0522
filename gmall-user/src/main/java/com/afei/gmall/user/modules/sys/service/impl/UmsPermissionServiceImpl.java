package com.afei.gmall.user.modules.sys.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.user.modules.sys.dao.UmsPermissionDao;
import com.afei.gmall.user.modules.sys.entity.UmsPermissionEntity;
import com.afei.gmall.user.modules.sys.service.UmsPermissionService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("umsPermissionService")
//@org.apache.dubbo.config.annotation.Service
public class UmsPermissionServiceImpl extends ServiceImpl<UmsPermissionDao, UmsPermissionEntity> implements UmsPermissionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsPermissionEntity> page = this.page(
                new Query<UmsPermissionEntity>().getPage(params),
                new QueryWrapper<UmsPermissionEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public int insert(UmsPermissionEntity umsPermissionEntity) {
        int insert = this.baseMapper.insert(umsPermissionEntity);
        return insert;
    }
}
