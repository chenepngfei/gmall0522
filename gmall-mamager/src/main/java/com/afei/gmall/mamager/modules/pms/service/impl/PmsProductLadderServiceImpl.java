package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsProductLadderDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsProductLadderEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductLadderService;


@Service("pmsProductLadderService")
public class PmsProductLadderServiceImpl extends ServiceImpl<PmsProductLadderDao, PmsProductLadderEntity> implements PmsProductLadderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsProductLadderEntity> page = this.page(
                new Query<PmsProductLadderEntity>().getPage(params),
                new QueryWrapper<PmsProductLadderEntity>()
        );

        return new PageUtils(page);
    }

}
