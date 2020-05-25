package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsAdminLoginLogEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 后台用户登录日志表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
public interface UmsAdminLoginLogService extends IService<UmsAdminLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

