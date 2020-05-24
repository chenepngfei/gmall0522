package com.afei.gmall.user.module.sys.controller;


import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.common.utils.Result;
import com.afei.gmall.user.module.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("query")
    @ResponseBody
    public Result query(@RequestParam Map<String, Object> params){
        PageUtils page = userService.queryPage(params);

        return Result.ok().put("page", page);
    }
}
