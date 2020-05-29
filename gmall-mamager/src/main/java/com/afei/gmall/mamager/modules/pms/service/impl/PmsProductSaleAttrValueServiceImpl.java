package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsProductSaleAttrValueDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsProductSaleAttrValueEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductSaleAttrValueService;


@Service("pmsProductSaleAttrValueService")
public class PmsProductSaleAttrValueServiceImpl extends ServiceImpl<PmsProductSaleAttrValueDao, PmsProductSaleAttrValueEntity> implements PmsProductSaleAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsProductSaleAttrValueEntity> page = this.page(
                new Query<PmsProductSaleAttrValueEntity>().getPage(params),
                new QueryWrapper<PmsProductSaleAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}
