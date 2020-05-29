package com.afei.gmall.mamager.modules.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@Data
@TableName("pms_product_info")
public class PmsProductInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@TableId
	private Long id;
	/**
	 * 商品名称
	 */
	private String productName;
	/**
	 * 商品描述(后台简述）
	 */
	private String description;
	/**
	 * 三级分类id
	 */
	private Long catalog3Id;
	/**
	 * 品牌id
	 */
	private Long tmId;

}
