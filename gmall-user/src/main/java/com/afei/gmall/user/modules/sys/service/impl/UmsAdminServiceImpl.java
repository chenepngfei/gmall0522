package com.afei.gmall.user.modules.sys.service.impl;


import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.dao.UmsAdminDao;
import com.afei.gmall.user.modules.sys.entity.UmsAdminEntity;
import com.afei.gmall.user.modules.sys.service.UmsAdminService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
@Service("umsAdminService")
//@org.apache.dubbo.config.annotation.Service(version = "${dubbo.version}")
public class UmsAdminServiceImpl extends ServiceImpl<UmsAdminDao, UmsAdminEntity> implements UmsAdminService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsAdminEntity> page = this.page(
                new Query<UmsAdminEntity>().getPage(params),
                new QueryWrapper<UmsAdminEntity>()
        );

        return new PageUtils(page);
    }

}
