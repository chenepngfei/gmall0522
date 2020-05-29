package com.afei.gmall.user.modules.sys.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.user.modules.sys.dao.UmsMemberLoginLogDao;
import com.afei.gmall.user.modules.sys.entity.UmsMemberLoginLogEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberLoginLogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("umsMemberLoginLogService")
//@org.apache.dubbo.config.annotation.Service(version = "${dubbo.version}")
public class UmsMemberLoginLogServiceImpl extends ServiceImpl<UmsMemberLoginLogDao, UmsMemberLoginLogEntity> implements UmsMemberLoginLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberLoginLogEntity> page = this.page(
                new Query<UmsMemberLoginLogEntity>().getPage(params),
                new QueryWrapper<UmsMemberLoginLogEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public IPage<UmsMemberLoginLogEntity> queryPageMap(Map<String, Object> params) {
        IPage<UmsMemberLoginLogEntity> page = this.page(
                new Query<UmsMemberLoginLogEntity>().getPage(params),
                new QueryWrapper<UmsMemberLoginLogEntity>()
        );
        return page;
    }

    @Override
    public List<UmsMemberLoginLogEntity> queryList(){
        return list();
    }

    @Override
    public Long saveEntity(UmsMemberLoginLogEntity umsMemberLoginLogEntity) {
        save(umsMemberLoginLogEntity);
        return umsMemberLoginLogEntity.getId();
    }

}
