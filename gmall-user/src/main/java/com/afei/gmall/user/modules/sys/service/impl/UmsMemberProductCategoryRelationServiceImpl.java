package com.afei.gmall.user.modules.sys.service.impl;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.dao.UmsMemberProductCategoryRelationDao;
import com.afei.gmall.user.modules.sys.entity.UmsMemberProductCategoryRelationEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberProductCategoryRelationService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.user.common.utils.Query;

@Service("umsMemberProductCategoryRelationService")
public class UmsMemberProductCategoryRelationServiceImpl extends ServiceImpl<UmsMemberProductCategoryRelationDao, UmsMemberProductCategoryRelationEntity> implements UmsMemberProductCategoryRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberProductCategoryRelationEntity> page = this.page(
                new Query<UmsMemberProductCategoryRelationEntity>().getPage(params),
                new QueryWrapper<UmsMemberProductCategoryRelationEntity>()
        );

        return new PageUtils(page);
    }

}
