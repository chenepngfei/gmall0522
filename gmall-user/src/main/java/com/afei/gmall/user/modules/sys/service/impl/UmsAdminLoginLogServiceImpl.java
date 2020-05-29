package com.afei.gmall.user.modules.sys.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.user.modules.sys.dao.UmsAdminLoginLogDao;
import com.afei.gmall.user.modules.sys.entity.UmsAdminLoginLogEntity;
import com.afei.gmall.user.modules.sys.service.UmsAdminLoginLogService;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service("umsAdminLoginLogService")
//@org.apache.dubbo.config.annotation.Service(version = "${dubbo.version}")
public class UmsAdminLoginLogServiceImpl extends ServiceImpl<UmsAdminLoginLogDao, UmsAdminLoginLogEntity> implements UmsAdminLoginLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsAdminLoginLogEntity> page = this.page(
                new Query<UmsAdminLoginLogEntity>().getPage(params),
                new QueryWrapper<UmsAdminLoginLogEntity>()
        );

        return new PageUtils(page);
    }

}
