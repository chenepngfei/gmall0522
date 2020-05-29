package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsSkuImageDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsSkuImageEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsSkuImageService;


@Service("pmsSkuImageService")
public class PmsSkuImageServiceImpl extends ServiceImpl<PmsSkuImageDao, PmsSkuImageEntity> implements PmsSkuImageService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSkuImageEntity> page = this.page(
                new Query<PmsSkuImageEntity>().getPage(params),
                new QueryWrapper<PmsSkuImageEntity>()
        );

        return new PageUtils(page);
    }

}
