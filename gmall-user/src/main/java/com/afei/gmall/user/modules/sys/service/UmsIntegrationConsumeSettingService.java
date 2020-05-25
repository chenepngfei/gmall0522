package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsIntegrationConsumeSettingEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 积分消费设置
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:42
 */
public interface UmsIntegrationConsumeSettingService extends IService<UmsIntegrationConsumeSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

