//package com.afei.gmall.user.module.sys.controller;
//
//import java.util.Arrays;
//import java.util.Map;
//import com.afei.gmall.user.common.utils.PageUtils;
//import com.afei.gmall.user.common.utils.Result;
//import com.afei.gmall.user.module.sys.service.UmsRolePermissionRelationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//
//
///**
// * 后台用户角色和权限关系表
// *
// * @email chenpfmail@163.com
// * @date 2020-05-25 09:06:27
// */
//@RestController
//@RequestMapping("sys/umsrolepermissionrelation")
//public class UmsRolePermissionRelationController {
//    @Autowired
//    private UmsRolePermissionRelationService umsRolePermissionRelationService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    public Result list(@RequestParam Map<String, Object> params){
//        PageUtils page = umsRolePermissionRelationService.queryPage(params);
//
//        return Result.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    public Result info(@PathVariable("id") Long id){
//        UmsRolePermissionRelationEntity umsRolePermissionRelation = umsRolePermissionRelationService.getById(id);
//
//        return Result.ok().put("umsRolePermissionRelation", umsRolePermissionRelation);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    public Result save(@RequestBody UmsRolePermissionRelationEntity umsRolePermissionRelation){
//        umsRolePermissionRelationService.save(umsRolePermissionRelation);
//
//        return Result.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    public Result update(@RequestBody UmsRolePermissionRelationEntity umsRolePermissionRelation){
//      //  ValidatorUtils.validateEntity(umsRolePermissionRelation);
//        umsRolePermissionRelationService.updateById(umsRolePermissionRelation);
//
//        return Result.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    public Result delete(@RequestBody Long[] ids){
//        umsRolePermissionRelationService.removeByIds(Arrays.asList(ids));
//
//        return Result.ok();
//    }
//
//}
