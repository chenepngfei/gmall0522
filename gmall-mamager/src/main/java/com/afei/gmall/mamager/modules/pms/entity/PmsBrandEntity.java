package com.afei.gmall.mamager.modules.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 品牌表
 * 
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@Data
@TableName("pms_brand")
public class PmsBrandEntity implements Serializable {
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
	 * 首字母
	 */
	private String firstLetter;
	/**
	 * 
	 */
	private Integer sort;
	/**
	 * 是否为品牌制造商：0->不是；1->是
	 */
	private Integer factoryStatus;
	/**
	 * 
	 */
	private Integer showStatus;
	/**
	 * 产品数量
	 */
	private Integer productCount;
	/**
	 * 产品评论数量
	 */
	private Integer productCommentCount;
	/**
	 * 品牌logo
	 */
	private String logo;
	/**
	 * 专区大图
	 */
	private String bigPic;
	/**
	 * 品牌故事
	 */
	private String brandStory;

}
