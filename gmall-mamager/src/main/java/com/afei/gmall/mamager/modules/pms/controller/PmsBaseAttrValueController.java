package com.afei.gmall.mamager.modules.pms.controller;

import java.util.Arrays;
import java.util.Map;

import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.afei.gmall.mamager.modules.pms.entity.PmsBaseAttrValueEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsBaseAttrValueService;



/**
 * 属性值表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsbaseattrvalue")
public class PmsBaseAttrValueController {
    @Autowired
    private PmsBaseAttrValueService pmsBaseAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("pms:pmsbaseattrvalue:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsBaseAttrValueService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("pms:pmsbaseattrvalue:info")
    public Result info(@PathVariable("id") Long id){
        PmsBaseAttrValueEntity pmsBaseAttrValue = pmsBaseAttrValueService.getById(id);

        return Result.ok().put("pmsBaseAttrValue", pmsBaseAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("pms:pmsbaseattrvalue:save")
    public Result save(@RequestBody PmsBaseAttrValueEntity pmsBaseAttrValue){
        pmsBaseAttrValueService.save(pmsBaseAttrValue);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pms:pmsbaseattrvalue:update")
    public Result update(@RequestBody PmsBaseAttrValueEntity pmsBaseAttrValue){
        //ValidatorUtils.validateEntity(pmsBaseAttrValue);
        pmsBaseAttrValueService.updateById(pmsBaseAttrValue);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("pms:pmsbaseattrvalue:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsBaseAttrValueService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
