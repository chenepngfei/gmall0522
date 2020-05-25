package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsMemberMemberTagRelationEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberMemberTagRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 用户和标签关系表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:42
 */
@RestController
@RequestMapping("sys/umsmembermembertagrelation")
public class UmsMemberMemberTagRelationController {
    @Autowired
    private UmsMemberMemberTagRelationService umsMemberMemberTagRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("sys:umsmembermembertagrelation:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberMemberTagRelationService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("sys:umsmembermembertagrelation:info")
    public Result info(@PathVariable("id") Long id){
        UmsMemberMemberTagRelationEntity umsMemberMemberTagRelation = umsMemberMemberTagRelationService.getById(id);

        return Result.ok().put("umsMemberMemberTagRelation", umsMemberMemberTagRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("sys:umsmembermembertagrelation:save")
    public Result save(@RequestBody UmsMemberMemberTagRelationEntity umsMemberMemberTagRelation){
        umsMemberMemberTagRelationService.save(umsMemberMemberTagRelation);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("sys:umsmembermembertagrelation:update")
    public Result update(@RequestBody UmsMemberMemberTagRelationEntity umsMemberMemberTagRelation){
        //ValidatorUtils.validateEntity(umsMemberMemberTagRelation);
        umsMemberMemberTagRelationService.updateById(umsMemberMemberTagRelation);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("sys:umsmembermembertagrelation:delete")
    public Result delete(@RequestBody Long[] ids){
        umsMemberMemberTagRelationService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
