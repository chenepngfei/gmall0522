package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsProductOperateLogDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsProductOperateLogEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductOperateLogService;


@Service("pmsProductOperateLogService")
public class PmsProductOperateLogServiceImpl extends ServiceImpl<PmsProductOperateLogDao, PmsProductOperateLogEntity> implements PmsProductOperateLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsProductOperateLogEntity> page = this.page(
                new Query<PmsProductOperateLogEntity>().getPage(params),
                new QueryWrapper<PmsProductOperateLogEntity>()
        );

        return new PageUtils(page);
    }

}
