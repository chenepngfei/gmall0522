package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsMemberPriceDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsMemberPriceEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsMemberPriceService;


@Service("pmsMemberPriceService")
public class PmsMemberPriceServiceImpl extends ServiceImpl<PmsMemberPriceDao, PmsMemberPriceEntity> implements PmsMemberPriceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsMemberPriceEntity> page = this.page(
                new Query<PmsMemberPriceEntity>().getPage(params),
                new QueryWrapper<PmsMemberPriceEntity>()
        );

        return new PageUtils(page);
    }

}
