package com.afei.gmall.user.modules.sys.service.impl;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.common.utils.Query;
import com.afei.gmall.user.modules.sys.dao.UmsRoleDao;
import com.afei.gmall.user.modules.sys.entity.UmsRoleEntity;
import com.afei.gmall.user.modules.sys.service.UmsRoleService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("umsRoleService")
public class UmsRoleServiceImpl extends ServiceImpl<UmsRoleDao, UmsRoleEntity> implements UmsRoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsRoleEntity> page = this.page(
                new Query<UmsRoleEntity>().getPage(params),
                new QueryWrapper<UmsRoleEntity>()
        );

        return new PageUtils(page);
    }

}
