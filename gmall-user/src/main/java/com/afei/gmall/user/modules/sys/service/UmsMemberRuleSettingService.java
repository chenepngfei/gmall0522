package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsMemberRuleSettingEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;

/**
 * 会员积分成长规则表
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
public interface UmsMemberRuleSettingService extends IService<UmsMemberRuleSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

