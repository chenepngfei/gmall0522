package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsProductInfoDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsProductInfoEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductInfoService;


@Service("pmsProductInfoService")
public class PmsProductInfoServiceImpl extends ServiceImpl<PmsProductInfoDao, PmsProductInfoEntity> implements PmsProductInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsProductInfoEntity> page = this.page(
                new Query<PmsProductInfoEntity>().getPage(params),
                new QueryWrapper<PmsProductInfoEntity>()
        );

        return new PageUtils(page);
    }

}
