package com.afei.gmall.mamager.modules.pms.service;

import com.afei.gmall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.afei.gmall.mamager.modules.pms.entity.PmsProductSaleAttrEntity;

import java.util.Map;

/**
 *
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
public interface PmsProductSaleAttrService extends IService<PmsProductSaleAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

