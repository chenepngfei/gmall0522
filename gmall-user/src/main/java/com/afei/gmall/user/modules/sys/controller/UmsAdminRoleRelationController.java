package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsAdminRoleRelationEntity;
import com.afei.gmall.user.modules.sys.service.UmsAdminRoleRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 后台用户和角色关系表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
@RestController
@RequestMapping("sys/umsadminrolerelation")
public class UmsAdminRoleRelationController {
    @Autowired
    private UmsAdminRoleRelationService umsAdminRoleRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("sys:umsadminrolerelation:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsAdminRoleRelationService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("sys:umsadminrolerelation:info")
    public Result info(@PathVariable("id") Long id){
        UmsAdminRoleRelationEntity umsAdminRoleRelation = umsAdminRoleRelationService.getById(id);

        return Result.ok().put("umsAdminRoleRelation", umsAdminRoleRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   /// @RequiresPermissions("sys:umsadminrolerelation:save")
    public Result save(@RequestBody UmsAdminRoleRelationEntity umsAdminRoleRelation){
        umsAdminRoleRelationService.save(umsAdminRoleRelation);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   /// @RequiresPermissions("sys:umsadminrolerelation:update")
    public Result update(@RequestBody UmsAdminRoleRelationEntity umsAdminRoleRelation){
        //ValidatorUtils.validateEntity(umsAdminRoleRelation);
        umsAdminRoleRelationService.updateById(umsAdminRoleRelation);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("sys:umsadminrolerelation:delete")
    public Result delete(@RequestBody Long[] ids){
        umsAdminRoleRelationService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
