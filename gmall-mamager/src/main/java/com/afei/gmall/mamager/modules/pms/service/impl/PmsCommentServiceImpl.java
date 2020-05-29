package com.afei.gmall.mamager.modules.pms.service.impl;

import com.afei.gmall.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.afei.gmall.common.utils.Query;
import com.afei.gmall.mamager.modules.pms.dao.PmsCommentDao;
import com.afei.gmall.mamager.modules.pms.entity.PmsCommentEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsCommentService;


@Service("pmsCommentService")
public class PmsCommentServiceImpl extends ServiceImpl<PmsCommentDao, PmsCommentEntity> implements PmsCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCommentEntity> page = this.page(
                new Query<PmsCommentEntity>().getPage(params),
                new QueryWrapper<PmsCommentEntity>()
        );

        return new PageUtils(page);
    }

}
