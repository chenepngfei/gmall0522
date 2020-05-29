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
import com.afei.gmall.mamager.modules.pms.entity.PmsBaseCatalog1Entity;
import com.afei.gmall.mamager.modules.pms.service.PmsBaseCatalog1Service;


/**
 * 一级分类表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsbasecatalog1")
public class PmsBaseCatalog1Controller {
    @Autowired
    private PmsBaseCatalog1Service pmsBaseCatalog1Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("pms:pmsbasecatalog1:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsBaseCatalog1Service.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
  //  @RequiresPermissions("pms:pmsbasecatalog1:info")
    public Result info(@PathVariable("id") Integer id){
        PmsBaseCatalog1Entity pmsBaseCatalog1 = pmsBaseCatalog1Service.getById(id);

        return Result.ok().put("pmsBaseCatalog1", pmsBaseCatalog1);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("pms:pmsbasecatalog1:save")
    public Result save(@RequestBody PmsBaseCatalog1Entity pmsBaseCatalog1){
        pmsBaseCatalog1Service.save(pmsBaseCatalog1);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("pms:pmsbasecatalog1:update")
    public Result update(@RequestBody PmsBaseCatalog1Entity pmsBaseCatalog1){
        //ValidatorUtils.validateEntity(pmsBaseCatalog1);
        pmsBaseCatalog1Service.updateById(pmsBaseCatalog1);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pms:pmsbasecatalog1:delete")
    public Result delete(@RequestBody Integer[] ids){
        pmsBaseCatalog1Service.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
