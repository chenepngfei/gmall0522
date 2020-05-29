package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsMemberMemberTagRelationEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 用户和标签关系表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:42
 */
public interface UmsMemberMemberTagRelationService extends IService<UmsMemberMemberTagRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

