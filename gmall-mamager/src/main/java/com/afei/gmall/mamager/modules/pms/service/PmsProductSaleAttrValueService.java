package com.afei.gmall.mamager.modules.pms.service;

import com.afei.gmall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.afei.gmall.mamager.modules.pms.entity.PmsProductSaleAttrValueEntity;

import java.util.Map;

/**
 * spu销售属性值
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
public interface PmsProductSaleAttrValueService extends IService<PmsProductSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

