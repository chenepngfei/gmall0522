package com.afei.gmall.user.modules.sys.dao;

import com.afei.gmall.user.modules.sys.entity.UmsMemberProductCategoryRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@Mapper
public interface UmsMemberProductCategoryRelationDao extends BaseMapper<UmsMemberProductCategoryRelationEntity> {

}
