package com.afei.gmall.user.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.afei.gmall.user.modules.sys.entity.UmsRolePermissionRelationEntity;

/**
 * 后台用户角色和权限关系表
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@Mapper
public interface UmsRolePermissionRelationDao extends BaseMapper<UmsRolePermissionRelationEntity> {

}
