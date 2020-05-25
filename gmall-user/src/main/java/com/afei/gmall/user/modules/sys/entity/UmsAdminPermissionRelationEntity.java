package com.afei.gmall.user.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
@Data
@TableName("ums_admin_permission_relation")
public class UmsAdminPermissionRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Long id;
	/**
	 *
	 */
	private Long adminId;
	/**
	 *
	 */
	private Long permissionId;
	/**
	 *
	 */
	private Integer type;

}
