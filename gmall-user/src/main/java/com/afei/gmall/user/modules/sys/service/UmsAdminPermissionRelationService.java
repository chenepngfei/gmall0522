package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsAdminPermissionRelationEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
public interface UmsAdminPermissionRelationService extends IService<UmsAdminPermissionRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

