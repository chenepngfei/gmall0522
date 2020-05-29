package com.afei.gmall.mamager.modules.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品评价回复表
 * 
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@Data
@TableName("pms_comment_replay")
public class PmsCommentReplayEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long commentId;
	/**
	 * 
	 */
	private String memberNickName;
	/**
	 * 
	 */
	private String memberIcon;
	/**
	 * 
	 */
	private String content;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 评论人员类型；0->会员；1->管理员
	 */
	private Integer type;

}
