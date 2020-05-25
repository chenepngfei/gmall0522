package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsMemberLoginLogEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
public interface UmsMemberLoginLogService extends IService<UmsMemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

