package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsProductFullReductionDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsProductFullReductionEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductFullReductionService;


@Service("pmsProductFullReductionService")
public class PmsProductFullReductionServiceImpl extends ServiceImpl<PmsProductFullReductionDao, PmsProductFullReductionEntity> implements PmsProductFullReductionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsProductFullReductionEntity> page = this.page(
                new Query<PmsProductFullReductionEntity>().getPage(params),
                new QueryWrapper<PmsProductFullReductionEntity>()
        );

        return new PageUtils(page);
    }

}
