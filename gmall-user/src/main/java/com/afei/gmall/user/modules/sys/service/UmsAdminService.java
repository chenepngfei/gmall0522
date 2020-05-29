package com.afei.gmall.user.modules.sys.service;
import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsAdminEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;

/**
 * 后台用户表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
public interface UmsAdminService extends IService<UmsAdminEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

