package com.afei.gmall.user.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户标签表
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@Data
@TableName("ums_member_tag")
public class UmsMemberTagEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Long id;
	/**
	 *
	 */
	private String name;
	/**
	 * 自动打标签完成订单数量
	 */
	private Integer finishOrderCount;
	/**
	 * 自动打标签完成订单金额
	 */
	private BigDecimal finishOrderAmount;

}
