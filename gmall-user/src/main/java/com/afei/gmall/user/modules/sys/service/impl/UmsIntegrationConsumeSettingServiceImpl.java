package com.afei.gmall.user.modules.sys.service.impl;


import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.dao.UmsIntegrationConsumeSettingDao;
import com.afei.gmall.user.modules.sys.entity.UmsIntegrationConsumeSettingEntity;
import com.afei.gmall.user.modules.sys.service.UmsIntegrationConsumeSettingService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
@Service("umsIntegrationConsumeSettingService")
//@org.apache.dubbo.config.annotation.Service
public class UmsIntegrationConsumeSettingServiceImpl extends ServiceImpl<UmsIntegrationConsumeSettingDao, UmsIntegrationConsumeSettingEntity> implements UmsIntegrationConsumeSettingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsIntegrationConsumeSettingEntity> page = this.page(
                new Query<UmsIntegrationConsumeSettingEntity>().getPage(params),
                new QueryWrapper<UmsIntegrationConsumeSettingEntity>()
        );

        return new PageUtils(page);
    }

}
