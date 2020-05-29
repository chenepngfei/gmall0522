package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsMemberProductCategoryRelationEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
public interface UmsMemberProductCategoryRelationService extends IService<UmsMemberProductCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

