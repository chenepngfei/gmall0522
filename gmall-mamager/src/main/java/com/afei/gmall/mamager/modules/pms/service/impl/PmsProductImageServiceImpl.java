package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsProductImageDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsProductImageEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductImageService;


@Service("pmsProductImageService")
public class PmsProductImageServiceImpl extends ServiceImpl<PmsProductImageDao, PmsProductImageEntity> implements PmsProductImageService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsProductImageEntity> page = this.page(
                new Query<PmsProductImageEntity>().getPage(params),
                new QueryWrapper<PmsProductImageEntity>()
        );

        return new PageUtils(page);
    }

}
