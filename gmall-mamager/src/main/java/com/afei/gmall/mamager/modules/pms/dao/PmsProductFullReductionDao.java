package com.afei.gmall.mamager.modules.pms.dao;

import com.afei.gmall.mamager.modules.pms.entity.PmsProductFullReductionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品满减表(只针对同商品)
 * 
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@Mapper
public interface PmsProductFullReductionDao extends BaseMapper<PmsProductFullReductionEntity> {
	
}
