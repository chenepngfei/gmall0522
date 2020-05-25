package com.afei.gmall.user.modules.sys.dao;

import com.afei.gmall.user.modules.sys.entity.UmsAdminLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台用户登录日志表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
@Mapper
public interface UmsAdminLoginLogDao extends BaseMapper<UmsAdminLoginLogEntity> {

}
