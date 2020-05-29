package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;
import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsIntegrationChangeHistoryEntity;
import com.afei.gmall.user.modules.sys.service.UmsIntegrationChangeHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 积分变化历史记录表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
@RestController
@RequestMapping("sys/umsintegrationchangehistory")
public class UmsIntegrationChangeHistoryController {
    @Autowired
    private UmsIntegrationChangeHistoryService umsIntegrationChangeHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("sys:umsintegrationchangehistory:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsIntegrationChangeHistoryService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("sys:umsintegrationchangehistory:info")
    public Result info(@PathVariable("id") Long id){
        UmsIntegrationChangeHistoryEntity umsIntegrationChangeHistory = umsIntegrationChangeHistoryService.getById(id);

        return Result.ok().put("umsIntegrationChangeHistory", umsIntegrationChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("sys:umsintegrationchangehistory:save")
    public Result save(@RequestBody UmsIntegrationChangeHistoryEntity umsIntegrationChangeHistory){
        umsIntegrationChangeHistoryService.save(umsIntegrationChangeHistory);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("sys:umsintegrationchangehistory:update")
    public Result update(@RequestBody UmsIntegrationChangeHistoryEntity umsIntegrationChangeHistory){
        //ValidatorUtils.validateEntity(umsIntegrationChangeHistory);
        umsIntegrationChangeHistoryService.updateById(umsIntegrationChangeHistory);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("sys:umsintegrationchangehistory:delete")
    public Result delete(@RequestBody Long[] ids){
        umsIntegrationChangeHistoryService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
