package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsMemberLevelEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 会员等级表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:42
 */
public interface UmsMemberLevelService extends IService<UmsMemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

