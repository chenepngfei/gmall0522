package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;
import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsPermissionEntity;
import com.afei.gmall.user.modules.sys.service.UmsPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 后台用户权限表
 *
 * @author Mark
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@RestController
@RequestMapping("sys/umspermission")
public class UmsPermissionController {
    @Autowired
    private UmsPermissionService umsPermissionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsPermissionService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
        UmsPermissionEntity umsPermission = umsPermissionService.getById(id);

        return Result.ok().put("umsPermission", umsPermission);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody UmsPermissionEntity umsPermission){
        umsPermissionService.save(umsPermission);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody UmsPermissionEntity umsPermission){
      //  ValidatorUtils.validateEntity(umsPermission);
        umsPermissionService.updateById(umsPermission);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
        umsPermissionService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
