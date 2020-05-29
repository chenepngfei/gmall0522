package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsProductSaleAttrDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsProductSaleAttrEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductSaleAttrService;


@Service("pmsProductSaleAttrService")
public class PmsProductSaleAttrServiceImpl extends ServiceImpl<PmsProductSaleAttrDao, PmsProductSaleAttrEntity> implements PmsProductSaleAttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsProductSaleAttrEntity> page = this.page(
                new Query<PmsProductSaleAttrEntity>().getPage(params),
                new QueryWrapper<PmsProductSaleAttrEntity>()
        );

        return new PageUtils(page);
    }

}
