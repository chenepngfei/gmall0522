package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsIntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;

/**
 * 积分变化历史记录表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
public interface UmsIntegrationChangeHistoryService extends IService<UmsIntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

