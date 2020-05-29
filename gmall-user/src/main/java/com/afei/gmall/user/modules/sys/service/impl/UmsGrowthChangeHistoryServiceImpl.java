package com.afei.gmall.user.modules.sys.service.impl;


import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.dao.UmsGrowthChangeHistoryDao;
import com.afei.gmall.user.modules.sys.entity.UmsGrowthChangeHistoryEntity;
import com.afei.gmall.user.modules.sys.service.UmsGrowthChangeHistoryService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
@Service("umsGrowthChangeHistoryService")
//@org.apache.dubbo.config.annotation.Service
public class UmsGrowthChangeHistoryServiceImpl extends ServiceImpl<UmsGrowthChangeHistoryDao, UmsGrowthChangeHistoryEntity> implements UmsGrowthChangeHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsGrowthChangeHistoryEntity> page = this.page(
                new Query<UmsGrowthChangeHistoryEntity>().getPage(params),
                new QueryWrapper<UmsGrowthChangeHistoryEntity>()
        );

        return new PageUtils(page);
    }

}
