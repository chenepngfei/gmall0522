package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsMemberLevelEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 会员等级表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:42
 */
@RestController
@RequestMapping("sys/umsmemberlevel")
public class UmsMemberLevelController {
    @Autowired
    private UmsMemberLevelService umsMemberLevelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("sys:umsmemberlevel:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberLevelService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("sys:umsmemberlevel:info")
    public Result info(@PathVariable("id") Long id){
        UmsMemberLevelEntity umsMemberLevel = umsMemberLevelService.getById(id);

        return Result.ok().put("umsMemberLevel", umsMemberLevel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //@RequiresPermissions("sys:umsmemberlevel:save")
    public Result save(@RequestBody UmsMemberLevelEntity umsMemberLevel){
        umsMemberLevelService.save(umsMemberLevel);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("sys:umsmemberlevel:update")
    public Result update(@RequestBody UmsMemberLevelEntity umsMemberLevel){
        //ValidatorUtils.validateEntity(umsMemberLevel);
        umsMemberLevelService.updateById(umsMemberLevel);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("sys:umsmemberlevel:delete")
    public Result delete(@RequestBody Long[] ids){
        umsMemberLevelService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
