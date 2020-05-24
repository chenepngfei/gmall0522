package com.afei.gmall.user.module.sys.service.impl;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.common.utils.Query;
import com.afei.gmall.user.module.sys.dao.UserDao;
import com.afei.gmall.user.module.sys.entity.User;
import com.afei.gmall.user.module.sys.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String username = (String)params.get("username");
        IPage<User> page = this.page(
                new Query<User>().getPage(params),
                new QueryWrapper<User>()
                        .like(StringUtils.isNotBlank(username),"username", username)
        );

        return new PageUtils(page);
    }
}
