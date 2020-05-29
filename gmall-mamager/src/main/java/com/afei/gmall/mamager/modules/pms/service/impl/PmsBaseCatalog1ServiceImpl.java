package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsBaseCatalog1Dao;
import com.afei.gmall.mamager.modules.pms.entity.PmsBaseCatalog1Entity;
import com.afei.gmall.mamager.modules.pms.service.PmsBaseCatalog1Service;


@Service("pmsBaseCatalog1Service")
public class PmsBaseCatalog1ServiceImpl extends ServiceImpl<PmsBaseCatalog1Dao, PmsBaseCatalog1Entity> implements PmsBaseCatalog1Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsBaseCatalog1Entity> page = this.page(
                new Query<PmsBaseCatalog1Entity>().getPage(params),
                new QueryWrapper<PmsBaseCatalog1Entity>()
        );

        return new PageUtils(page);
    }

}
