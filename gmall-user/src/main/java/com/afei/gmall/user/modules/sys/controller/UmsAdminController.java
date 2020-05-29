//package com.afei.gmall.user.modules.sys.controller;
//
//import java.util.Arrays;
//import java.util.Map;
//
//import com.afei.gmall.common.utils.PageUtils;
//import com.afei.gmall.common.utils.Result;
//import com.afei.gmall.user.modules.sys.entity.UmsAdminEntity;
//import com.afei.gmall.user.modules.sys.service.UmsAdminService;
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
// * 后台用户表
// *
// * @author cpf
// * @email chenpfmail@163.com
// * @date 2020-05-25 09:37:43
// */
//@RestController
//@RequestMapping("sys/umsadmin")
//public class UmsAdminController {
//    @Autowired
//    private UmsAdminService umsAdminService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    public Result list(@RequestParam Map<String, Object> params){
//        PageUtils page = umsAdminService.queryPage(params);
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
//        UmsAdminEntity umsAdmin = umsAdminService.getById(id);
//
//        return Result.ok().put("umsAdmin", umsAdmin);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    public Result save(@RequestBody UmsAdminEntity umsAdmin){
//        umsAdminService.save(umsAdmin);
//
//        return Result.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    public Result update(@RequestBody UmsAdminEntity umsAdmin){
//        //ValidatorUtils.validateEntity(umsAdmin);
//        umsAdminService.updateById(umsAdmin);
//
//        return Result.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    public Result delete(@RequestBody Long[] ids){
//        umsAdminService.removeByIds(Arrays.asList(ids));
//
//        return Result.ok();
//    }
//
//}
