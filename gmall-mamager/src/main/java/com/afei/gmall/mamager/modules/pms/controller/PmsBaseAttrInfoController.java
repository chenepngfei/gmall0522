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

import com.afei.gmall.mamager.modules.pms.entity.PmsBaseAttrInfoEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsBaseAttrInfoService;



/**
 * 属性表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsbaseattrinfo")
public class PmsBaseAttrInfoController {
    @Autowired
    private PmsBaseAttrInfoService pmsBaseAttrInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("pms:pmsbaseattrinfo:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsBaseAttrInfoService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("pms:pmsbaseattrinfo:info")
    public Result info(@PathVariable("id") Long id){
        PmsBaseAttrInfoEntity pmsBaseAttrInfo = pmsBaseAttrInfoService.getById(id);

        return Result.ok().put("pmsBaseAttrInfo", pmsBaseAttrInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("pms:pmsbaseattrinfo:save")
    public Result save(@RequestBody PmsBaseAttrInfoEntity pmsBaseAttrInfo){
        pmsBaseAttrInfoService.save(pmsBaseAttrInfo);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("pms:pmsbaseattrinfo:update")
    public Result update(@RequestBody PmsBaseAttrInfoEntity pmsBaseAttrInfo){
        //ValidatorUtils.validateEntity(pmsBaseAttrInfo);
        pmsBaseAttrInfoService.updateById(pmsBaseAttrInfo);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pms:pmsbaseattrinfo:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsBaseAttrInfoService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
