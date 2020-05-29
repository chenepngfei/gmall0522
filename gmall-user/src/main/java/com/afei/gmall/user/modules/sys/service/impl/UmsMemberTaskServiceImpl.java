package com.afei.gmall.user.modules.sys.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.user.modules.sys.dao.UmsMemberTaskDao;
import com.afei.gmall.user.modules.sys.entity.UmsMemberTaskEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberTaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.afei.gmall.common.utils.Query;
@Service("umsMemberTaskService")
//@org.apache.dubbo.config.annotation.Service
public class UmsMemberTaskServiceImpl extends ServiceImpl<UmsMemberTaskDao, UmsMemberTaskEntity> implements UmsMemberTaskService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberTaskEntity> page = this.page(
                new Query<UmsMemberTaskEntity>().getPage(params),
                new QueryWrapper<UmsMemberTaskEntity>()
        );

        return new PageUtils(page);
    }

}
