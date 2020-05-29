package com.afei.gmall.mamager.modules.pms.service;

import com.afei.gmall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.afei.gmall.mamager.modules.pms.entity.PmsSkuAttrValueEntity;

import java.util.Map;

/**
 * sku平台属性值关联表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
public interface PmsSkuAttrValueService extends IService<PmsSkuAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

