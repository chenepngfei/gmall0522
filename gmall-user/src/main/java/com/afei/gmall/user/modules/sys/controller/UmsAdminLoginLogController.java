package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsAdminLoginLogEntity;
import com.afei.gmall.user.modules.sys.service.UmsAdminLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 后台用户登录日志表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
@RestController
@RequestMapping("sys/umsadminloginlog")
public class UmsAdminLoginLogController {
    @Autowired
    private UmsAdminLoginLogService umsAdminLoginLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("sys:umsadminloginlog:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsAdminLoginLogService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("sys:umsadminloginlog:info")
    public Result info(@PathVariable("id") Long id){
        UmsAdminLoginLogEntity umsAdminLoginLog = umsAdminLoginLogService.getById(id);

        return Result.ok().put("umsAdminLoginLog", umsAdminLoginLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("sys:umsadminloginlog:save")
    public Result save(@RequestBody UmsAdminLoginLogEntity umsAdminLoginLog){
        umsAdminLoginLogService.save(umsAdminLoginLog);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("sys:umsadminloginlog:update")
    public Result update(@RequestBody UmsAdminLoginLogEntity umsAdminLoginLog){
        //ValidatorUtils.validateEntity(umsAdminLoginLog);
        umsAdminLoginLogService.updateById(umsAdminLoginLog);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("sys:umsadminloginlog:delete")
    public Result delete(@RequestBody Long[] ids){
        umsAdminLoginLogService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
