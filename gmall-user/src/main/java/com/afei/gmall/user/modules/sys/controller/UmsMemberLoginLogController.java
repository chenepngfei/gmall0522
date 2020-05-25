package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsMemberLoginLogEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




/**
 * 会员登录记录
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@RestController
@RequestMapping("sys/umsmemberloginlog")
public class UmsMemberLoginLogController {
    @Autowired
    private UmsMemberLoginLogService umsMemberLoginLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberLoginLogService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
        UmsMemberLoginLogEntity umsMemberLoginLog = umsMemberLoginLogService.getById(id);

        return Result.ok().put("umsMemberLoginLog", umsMemberLoginLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save( ){
        UmsMemberLoginLogEntity umsMemberLoginLog = new UmsMemberLoginLogEntity();
        umsMemberLoginLog.setMemberId(121l);
        umsMemberLoginLog.setCity("213");
        umsMemberLoginLog.setCreateTime(new Date());
        umsMemberLoginLog.setIp("123");
        umsMemberLoginLog.setLoginType(1);
        umsMemberLoginLog.setProvince("sdfs");
        umsMemberLoginLogService.save(umsMemberLoginLog);

        System.out.println("umsMemberLoginLog.getId() = " + umsMemberLoginLog.getId());
        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody UmsMemberLoginLogEntity umsMemberLoginLog){
    //    ValidatorUtils.validateEntity(umsMemberLoginLog);
        umsMemberLoginLogService.updateById(umsMemberLoginLog);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
        umsMemberLoginLogService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
