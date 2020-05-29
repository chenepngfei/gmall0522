package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsSkuAttrValueDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsSkuAttrValueEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsSkuAttrValueService;


@Service("pmsSkuAttrValueService")
public class PmsSkuAttrValueServiceImpl extends ServiceImpl<PmsSkuAttrValueDao, PmsSkuAttrValueEntity> implements PmsSkuAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSkuAttrValueEntity> page = this.page(
                new Query<PmsSkuAttrValueEntity>().getPage(params),
                new QueryWrapper<PmsSkuAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}
