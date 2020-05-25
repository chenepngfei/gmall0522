package com.afei.gmall.user.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 会员统计信息
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@Data
@TableName("ums_member_statistics_info")
public class UmsMemberStatisticsInfoEntity implements Serializable {
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
	 * 累计消费金额
	 */
	private BigDecimal consumeAmount;
	/**
	 * 订单数量
	 */
	private Integer orderCount;
	/**
	 * 优惠券数量
	 */
	private Integer couponCount;
	/**
	 * 评价数
	 */
	private Integer commentCount;
	/**
	 * 退货数量
	 */
	private Integer returnOrderCount;
	/**
	 * 登录次数
	 */
	private Integer loginCount;
	/**
	 * 关注数量
	 */
	private Integer attendCount;
	/**
	 * 粉丝数量
	 */
	private Integer fansCount;
	/**
	 *
	 */
	private Integer collectProductCount;
	/**
	 *
	 */
	private Integer collectSubjectCount;
	/**
	 *
	 */
	private Integer collectTopicCount;
	/**
	 *
	 */
	private Integer collectCommentCount;
	/**
	 *
	 */
	private Integer inviteFriendCount;
	/**
	 * 最后一次下订单时间
	 */
	private Date recentOrderTime;

}
