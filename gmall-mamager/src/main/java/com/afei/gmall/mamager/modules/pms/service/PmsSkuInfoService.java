package com.afei.gmall.mamager.modules.pms.service;

import com.afei.gmall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.afei.gmall.mamager.modules.pms.entity.PmsSkuInfoEntity;

import java.util.Map;

/**
 * 库存单元表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
public interface PmsSkuInfoService extends IService<PmsSkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

