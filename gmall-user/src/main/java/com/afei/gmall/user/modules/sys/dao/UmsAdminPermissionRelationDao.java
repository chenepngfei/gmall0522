package com.afei.gmall.user.modules.sys.dao;

import com.afei.gmall.user.modules.sys.entity.UmsAdminPermissionRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
@Mapper
public interface UmsAdminPermissionRelationDao extends BaseMapper<UmsAdminPermissionRelationEntity> {

}
