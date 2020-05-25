package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsMemberEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 会员表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
public interface UmsMemberService extends IService<UmsMemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

