package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsProductVertifyRecordDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsProductVertifyRecordEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductVertifyRecordService;


@Service("pmsProductVertifyRecordService")
public class PmsProductVertifyRecordServiceImpl extends ServiceImpl<PmsProductVertifyRecordDao, PmsProductVertifyRecordEntity> implements PmsProductVertifyRecordService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsProductVertifyRecordEntity> page = this.page(
                new Query<PmsProductVertifyRecordEntity>().getPage(params),
                new QueryWrapper<PmsProductVertifyRecordEntity>()
        );

        return new PageUtils(page);
    }

}
