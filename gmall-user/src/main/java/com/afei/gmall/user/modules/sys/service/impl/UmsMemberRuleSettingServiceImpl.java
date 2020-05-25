package com.afei.gmall.user.modules.sys.service.impl;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.dao.UmsMemberRuleSettingDao;
import com.afei.gmall.user.modules.sys.entity.UmsMemberRuleSettingEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberRuleSettingService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.user.common.utils.Query;

@Service("umsMemberRuleSettingService")
public class UmsMemberRuleSettingServiceImpl extends ServiceImpl<UmsMemberRuleSettingDao, UmsMemberRuleSettingEntity> implements UmsMemberRuleSettingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberRuleSettingEntity> page = this.page(
                new Query<UmsMemberRuleSettingEntity>().getPage(params),
                new QueryWrapper<UmsMemberRuleSettingEntity>()
        );

        return new PageUtils(page);
    }

}
