package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;
import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsAdminPermissionRelationEntity;
import com.afei.gmall.user.modules.sys.service.UmsAdminPermissionRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
@RestController
@RequestMapping("sys/umsadminpermissionrelation")
public class UmsAdminPermissionRelationController {
    @Autowired
    private UmsAdminPermissionRelationService umsAdminPermissionRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("sys:umsadminpermissionrelation:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsAdminPermissionRelationService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("sys:umsadminpermissionrelation:info")
    public Result info(@PathVariable("id") Long id){
        UmsAdminPermissionRelationEntity umsAdminPermissionRelation = umsAdminPermissionRelationService.getById(id);

        return Result.ok().put("umsAdminPermissionRelation", umsAdminPermissionRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("sys:umsadminpermissionrelation:save")
    public Result save(@RequestBody UmsAdminPermissionRelationEntity umsAdminPermissionRelation){
        umsAdminPermissionRelationService.save(umsAdminPermissionRelation);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("sys:umsadminpermissionrelation:update")
    public Result update(@RequestBody UmsAdminPermissionRelationEntity umsAdminPermissionRelation){
        //ValidatorUtils.validateEntity(umsAdminPermissionRelation);
        umsAdminPermissionRelationService.updateById(umsAdminPermissionRelation);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   /// @RequiresPermissions("sys:umsadminpermissionrelation:delete")
    public Result delete(@RequestBody Long[] ids){
        umsAdminPermissionRelationService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
