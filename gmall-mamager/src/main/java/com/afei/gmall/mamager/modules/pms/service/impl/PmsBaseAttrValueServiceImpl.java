package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsBaseAttrValueDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsBaseAttrValueEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsBaseAttrValueService;


@Service("pmsBaseAttrValueService")
public class PmsBaseAttrValueServiceImpl extends ServiceImpl<PmsBaseAttrValueDao, PmsBaseAttrValueEntity> implements PmsBaseAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsBaseAttrValueEntity> page = this.page(
                new Query<PmsBaseAttrValueEntity>().getPage(params),
                new QueryWrapper<PmsBaseAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}
