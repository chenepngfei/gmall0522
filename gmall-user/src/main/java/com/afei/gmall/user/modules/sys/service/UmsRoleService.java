package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsRoleEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;

/**
 * 后台用户角色表
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
public interface UmsRoleService extends IService<UmsRoleEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

