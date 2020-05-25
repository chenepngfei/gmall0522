package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsMemberRuleSettingEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberRuleSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 会员积分成长规则表
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@RestController
@RequestMapping("sys/umsmemberrulesetting")
public class UmsMemberRuleSettingController {
    @Autowired
    private UmsMemberRuleSettingService umsMemberRuleSettingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberRuleSettingService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
        UmsMemberRuleSettingEntity umsMemberRuleSetting = umsMemberRuleSettingService.getById(id);

        return Result.ok().put("umsMemberRuleSetting", umsMemberRuleSetting);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody UmsMemberRuleSettingEntity umsMemberRuleSetting){
        umsMemberRuleSettingService.save(umsMemberRuleSetting);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody UmsMemberRuleSettingEntity umsMemberRuleSetting){
      //  ValidatorUtils.validateEntity(umsMemberRuleSetting);
        umsMemberRuleSettingService.updateById(umsMemberRuleSetting);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
        umsMemberRuleSettingService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
