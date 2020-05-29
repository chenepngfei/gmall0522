package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsMemberTagEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;

/**
 * 用户标签表
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
public interface UmsMemberTagService extends IService<UmsMemberTagEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

