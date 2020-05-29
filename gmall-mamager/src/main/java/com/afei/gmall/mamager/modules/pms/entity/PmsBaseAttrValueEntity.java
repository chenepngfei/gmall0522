package com.afei.gmall.mamager.modules.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 属性值表
 * 
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@Data
@TableName("pms_base_attr_value")
public class PmsBaseAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 属性值名称
	 */
	private String valueName;
	/**
	 * 属性id
	 */
	private Long attrId;
	/**
	 * 启用：1 停用：0 1
	 */
	private String isEnabled;

}
