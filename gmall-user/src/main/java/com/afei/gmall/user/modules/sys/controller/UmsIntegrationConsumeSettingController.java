package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;
import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsIntegrationConsumeSettingEntity;
import com.afei.gmall.user.modules.sys.service.UmsIntegrationConsumeSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 积分消费设置
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:42
 */
@RestController
@RequestMapping("sys/umsintegrationconsumesetting")
public class UmsIntegrationConsumeSettingController {
    @Autowired
    private UmsIntegrationConsumeSettingService umsIntegrationConsumeSettingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("sys:umsintegrationconsumesetting:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsIntegrationConsumeSettingService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   /// @RequiresPermissions("sys:umsintegrationconsumesetting:info")
    public Result info(@PathVariable("id") Long id){
        UmsIntegrationConsumeSettingEntity umsIntegrationConsumeSetting = umsIntegrationConsumeSettingService.getById(id);

        return Result.ok().put("umsIntegrationConsumeSetting", umsIntegrationConsumeSetting);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("sys:umsintegrationconsumesetting:save")
    public Result save(@RequestBody UmsIntegrationConsumeSettingEntity umsIntegrationConsumeSetting){
        umsIntegrationConsumeSettingService.save(umsIntegrationConsumeSetting);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("sys:umsintegrationconsumesetting:update")
    public Result update(@RequestBody UmsIntegrationConsumeSettingEntity umsIntegrationConsumeSetting){
        //ValidatorUtils.validateEntity(umsIntegrationConsumeSetting);
        umsIntegrationConsumeSettingService.updateById(umsIntegrationConsumeSetting);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("sys:umsintegrationconsumesetting:delete")
    public Result delete(@RequestBody Long[] ids){
        umsIntegrationConsumeSettingService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
