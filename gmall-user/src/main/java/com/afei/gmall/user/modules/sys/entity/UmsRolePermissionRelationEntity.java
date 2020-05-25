package com.afei.gmall.user.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 后台用户角色和权限关系表
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@Data
@TableName("ums_role_permission_relation")
public class UmsRolePermissionRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Long id;
	/**
	 *
	 */
	private Long roleId;
	/**
	 *
	 */
	private Long permissionId;

}
