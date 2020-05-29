package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;
import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsGrowthChangeHistoryEntity;
import com.afei.gmall.user.modules.sys.service.UmsGrowthChangeHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 成长值变化历史记录表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
@RestController
@RequestMapping("sys/umsgrowthchangehistory")
public class UmsGrowthChangeHistoryController {
    @Autowired
    private UmsGrowthChangeHistoryService umsGrowthChangeHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("sys:umsgrowthchangehistory:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsGrowthChangeHistoryService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("sys:umsgrowthchangehistory:info")
    public Result info(@PathVariable("id") Long id){
        UmsGrowthChangeHistoryEntity umsGrowthChangeHistory = umsGrowthChangeHistoryService.getById(id);

        return Result.ok().put("umsGrowthChangeHistory", umsGrowthChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("sys:umsgrowthchangehistory:save")
    public Result save(@RequestBody UmsGrowthChangeHistoryEntity umsGrowthChangeHistory){
        umsGrowthChangeHistoryService.save(umsGrowthChangeHistory);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("sys:umsgrowthchangehistory:update")
    public Result update(@RequestBody UmsGrowthChangeHistoryEntity umsGrowthChangeHistory){
        //ValidatorUtils.validateEntity(umsGrowthChangeHistory);
        umsGrowthChangeHistoryService.updateById(umsGrowthChangeHistory);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("sys:umsgrowthchangehistory:delete")
    public Result delete(@RequestBody Long[] ids){
        umsGrowthChangeHistoryService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
