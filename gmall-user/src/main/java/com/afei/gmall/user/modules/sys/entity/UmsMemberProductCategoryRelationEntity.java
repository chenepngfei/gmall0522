package com.afei.gmall.user.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@Data
@TableName("ums_member_product_category_relation")
public class UmsMemberProductCategoryRelationEntity implements Serializable {
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
	private Long productCategoryId;

}
