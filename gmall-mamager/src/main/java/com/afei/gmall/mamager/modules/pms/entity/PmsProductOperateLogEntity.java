package com.afei.gmall.mamager.modules.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
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
@TableName("pms_product_operate_log")
public class PmsProductOperateLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long productId;
	/**
	 * 
	 */
	private BigDecimal priceOld;
	/**
	 * 
	 */
	private BigDecimal priceNew;
	/**
	 * 
	 */
	private BigDecimal salePriceOld;
	/**
	 * 
	 */
	private BigDecimal salePriceNew;
	/**
	 * 赠送的积分
	 */
	private Integer giftPointOld;
	/**
	 * 
	 */
	private Integer giftPointNew;
	/**
	 * 
	 */
	private Integer usePointLimitOld;
	/**
	 * 
	 */
	private Integer usePointLimitNew;
	/**
	 * 操作人
	 */
	private String operateMan;
	/**
	 * 
	 */
	private Date createTime;

}
