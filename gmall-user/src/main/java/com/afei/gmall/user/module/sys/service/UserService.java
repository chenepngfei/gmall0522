package com.afei.gmall.user.module.sys.service;

import com.afei.common.utils.PageUtils;
import com.afei.gmall.user.module.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

public interface UserService extends IService<User> {
    PageUtils queryPage(Map<String, Object> params);
}
