package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsBaseSaleAttrDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsBaseSaleAttrEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsBaseSaleAttrService;


@Service("pmsBaseSaleAttrService")
public class PmsBaseSaleAttrServiceImpl extends ServiceImpl<PmsBaseSaleAttrDao, PmsBaseSaleAttrEntity> implements PmsBaseSaleAttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsBaseSaleAttrEntity> page = this.page(
                new Query<PmsBaseSaleAttrEntity>().getPage(params),
                new QueryWrapper<PmsBaseSaleAttrEntity>()
        );

        return new PageUtils(page);
    }

}
