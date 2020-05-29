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

import com.afei.gmall.mamager.modules.pms.entity.PmsBaseSaleAttrEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsBaseSaleAttrService;



/**
 *
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsbasesaleattr")
public class PmsBaseSaleAttrController {
    @Autowired
    private PmsBaseSaleAttrService pmsBaseSaleAttrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
  //  @RequiresPermissions("pms:pmsbasesaleattr:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsBaseSaleAttrService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
  //  @RequiresPermissions("pms:pmsbasesaleattr:info")
    public Result info(@PathVariable("id") Long id){
        PmsBaseSaleAttrEntity pmsBaseSaleAttr = pmsBaseSaleAttrService.getById(id);

        return Result.ok().put("pmsBaseSaleAttr", pmsBaseSaleAttr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("pms:pmsbasesaleattr:save")
    public Result save(@RequestBody PmsBaseSaleAttrEntity pmsBaseSaleAttr){
        pmsBaseSaleAttrService.save(pmsBaseSaleAttr);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pms:pmsbasesaleattr:update")
    public Result update(@RequestBody PmsBaseSaleAttrEntity pmsBaseSaleAttr){
        //ValidatorUtils.validateEntity(pmsBaseSaleAttr);
        pmsBaseSaleAttrService.updateById(pmsBaseSaleAttr);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("pms:pmsbasesaleattr:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsBaseSaleAttrService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
