package com.afei.gmall.api.controller;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsMemberLoginLogEntity;
import com.afei.gmall.user.modules.sys.service.UmsAdminLoginLogService;
import com.afei.gmall.user.modules.sys.service.UmsAdminPermissionRelationService;
import com.afei.gmall.user.modules.sys.service.UmsMemberLoginLogService;
import com.afei.gmall.user.modules.sys.service.impl.UmsAdminPermissionRelationServiceImpl;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
@CrossOrigin
//@CrossOrigin(origins = "http://localhost:4000")
public class testController {
//    @Reference(version = "1.0.0", timeout = 3000)
//    UmsAdminLoginLogService umsAdminLoginLogService;
    //@Reference(version = "1.0.0", timeout = 3000)
    @Autowired
    UmsMemberLoginLogService umsMemberLoginLogService;
   // @Reference(version = "1.0.0", timeout = 3000)
   // UmsAdminPermissionRelationService umsAdminPermissionRelationService;

    @RequestMapping("/index")
    @ResponseBody
    public Result hh(@RequestParam Map<String, Object> params){
        //PageUtils page = umsMemberLoginLogService.queryPage(params);
       List<UmsMemberLoginLogEntity> umsMemberLoginLogEntities = umsMemberLoginLogService.queryList();
        return Result.ok().put("page", umsMemberLoginLogEntities);
    }
    @RequestMapping("/query")
    @ResponseBody
    public Result query(@RequestParam Map<String, Object> params){
        IPage<UmsMemberLoginLogEntity> ipage = umsMemberLoginLogService.queryPageMap(params);
       // List<UmsMemberLoginLogEntity> umsMemberLoginLogEntities = umsMemberLoginLogService.queryList();
        PageUtils page = new PageUtils(ipage);
        return Result.ok().put("page", page);
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(){

        UmsMemberLoginLogEntity umsMemberLoginLog = new UmsMemberLoginLogEntity();
        umsMemberLoginLog.setMemberId(121l);
        umsMemberLoginLog.setCity("213");
        umsMemberLoginLog.setCreateTime(new Date());
        umsMemberLoginLog.setIp("123");
        umsMemberLoginLog.setLoginType(1);
        umsMemberLoginLog.setProvince("sdfs");
        Long id = umsMemberLoginLogService.saveEntity(umsMemberLoginLog);
        System.out.println("=============================="+umsMemberLoginLog.getId());
        return Result.ok().put("pageUtils",id);
    }
}
