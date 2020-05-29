package com.afei.gmall.user.modules.sys.service.impl;


import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.dao.UmsMemberReceiveAddressDao;
import com.afei.gmall.user.modules.sys.entity.UmsMemberReceiveAddressEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberReceiveAddressService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
@Service("umsMemberReceiveAddressService")
//@org.apache.dubbo.config.annotation.Service
public class UmsMemberReceiveAddressServiceImpl extends ServiceImpl<UmsMemberReceiveAddressDao, UmsMemberReceiveAddressEntity> implements UmsMemberReceiveAddressService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberReceiveAddressEntity> page = this.page(
                new Query<UmsMemberReceiveAddressEntity>().getPage(params),
                new QueryWrapper<UmsMemberReceiveAddressEntity>()
        );

        return new PageUtils(page);
    }

}
