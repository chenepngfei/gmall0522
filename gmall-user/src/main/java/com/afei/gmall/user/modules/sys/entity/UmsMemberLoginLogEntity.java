package com.afei.gmall.user.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员登录记录
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@Data
@TableName("ums_member_login_log")
public class UmsMemberLoginLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Long id;
	/**
	 *
	 */
	private Long memberId;
	/**
	 *
	 */
	private Date createTime;
	/**
	 *
	 */
	private String ip;
	/**
	 *
	 */
	private String city;
	/**
	 * 登录类型：0->PC；1->android;2->ios;3->小程序
	 */
	private Integer loginType;
	/**
	 *
	 */
	private String province;

}
