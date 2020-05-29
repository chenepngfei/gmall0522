package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsBaseCatalog2Dao;
import com.afei.gmall.mamager.modules.pms.entity.PmsBaseCatalog2Entity;
import com.afei.gmall.mamager.modules.pms.service.PmsBaseCatalog2Service;


@Service("pmsBaseCatalog2Service")
public class PmsBaseCatalog2ServiceImpl extends ServiceImpl<PmsBaseCatalog2Dao, PmsBaseCatalog2Entity> implements PmsBaseCatalog2Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsBaseCatalog2Entity> page = this.page(
                new Query<PmsBaseCatalog2Entity>().getPage(params),
                new QueryWrapper<PmsBaseCatalog2Entity>()
        );

        return new PageUtils(page);
    }

}
