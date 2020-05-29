package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsBaseCatalog3Dao;
import com.afei.gmall.mamager.modules.pms.entity.PmsBaseCatalog3Entity;
import com.afei.gmall.mamager.modules.pms.service.PmsBaseCatalog3Service;


@Service("pmsBaseCatalog3Service")
public class PmsBaseCatalog3ServiceImpl extends ServiceImpl<PmsBaseCatalog3Dao, PmsBaseCatalog3Entity> implements PmsBaseCatalog3Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsBaseCatalog3Entity> page = this.page(
                new Query<PmsBaseCatalog3Entity>().getPage(params),
                new QueryWrapper<PmsBaseCatalog3Entity>()
        );

        return new PageUtils(page);
    }

}
