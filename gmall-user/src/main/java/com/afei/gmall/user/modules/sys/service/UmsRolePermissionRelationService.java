package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import com.afei.gmall.user.modules.sys.entity.UmsRolePermissionRelationEntity;
/**
 * 后台用户角色和权限关系表
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
public interface UmsRolePermissionRelationService extends IService<UmsRolePermissionRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

