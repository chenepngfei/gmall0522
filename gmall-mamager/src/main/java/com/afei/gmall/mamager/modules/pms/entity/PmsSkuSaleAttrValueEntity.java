package com.afei.gmall.mamager.modules.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * sku销售属性值
 * 
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@Data
@TableName("pms_sku_sale_attr_value")
public class PmsSkuSaleAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 库存单元id
	 */
	private Long skuId;
	/**
	 * 销售属性id（冗余)
	 */
	private Long saleAttrId;
	/**
	 * 销售属性值id
	 */
	private Long saleAttrValueId;
	/**
	 * 销售属性名称(冗余)
	 */
	private String saleAttrName;
	/**
	 * 销售属性值名称(冗余)
	 */
	private String saleAttrValueName;

}
