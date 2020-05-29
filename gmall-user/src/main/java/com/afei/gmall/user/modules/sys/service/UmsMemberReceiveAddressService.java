package com.afei.gmall.user.modules.sys.service;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.user.modules.sys.entity.UmsMemberReceiveAddressEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;

/**
 * 会员收货地址表
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
public interface UmsMemberReceiveAddressService extends IService<UmsMemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

