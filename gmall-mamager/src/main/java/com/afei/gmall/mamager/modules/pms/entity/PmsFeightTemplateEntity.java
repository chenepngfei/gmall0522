package com.afei.gmall.mamager.modules.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 运费模版
 * 
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@Data
@TableName("pms_feight_template")
public class PmsFeightTemplateEntity implements Serializable {
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
	 * 计费类型:0->按重量；1->按件数
	 */
	private Integer chargeType;
	/**
	 * 首重kg
	 */
	private BigDecimal firstWeight;
	/**
	 * 首费（元）
	 */
	private BigDecimal firstFee;
	/**
	 * 
	 */
	private BigDecimal continueWeight;
	/**
	 * 
	 */
	private BigDecimal continmeFee;
	/**
	 * 目的地（省、市）
	 */
	private String dest;

}
