package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.mamager.modules.pms.dao.PmsBaseAttrInfoDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsBaseAttrInfoEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsBaseAttrInfoService;


@Service("pmsBaseAttrInfoService")
public class PmsBaseAttrInfoServiceImpl extends ServiceImpl<PmsBaseAttrInfoDao, PmsBaseAttrInfoEntity> implements PmsBaseAttrInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsBaseAttrInfoEntity> page = this.page(
                new Query<PmsBaseAttrInfoEntity>().getPage(params),
                new QueryWrapper<PmsBaseAttrInfoEntity>()
        );

        return new PageUtils(page);
    }

}
