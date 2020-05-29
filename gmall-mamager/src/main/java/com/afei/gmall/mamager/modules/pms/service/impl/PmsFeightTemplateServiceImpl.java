package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsFeightTemplateDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsFeightTemplateEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsFeightTemplateService;


@Service("pmsFeightTemplateService")
public class PmsFeightTemplateServiceImpl extends ServiceImpl<PmsFeightTemplateDao, PmsFeightTemplateEntity> implements PmsFeightTemplateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsFeightTemplateEntity> page = this.page(
                new Query<PmsFeightTemplateEntity>().getPage(params),
                new QueryWrapper<PmsFeightTemplateEntity>()
        );

        return new PageUtils(page);
    }

}
