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

import com.afei.gmall.mamager.modules.pms.entity.PmsBaseCatalog2Entity;
import com.afei.gmall.mamager.modules.pms.service.PmsBaseCatalog2Service;



/**
 *
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsbasecatalog2")
public class PmsBaseCatalog2Controller {
    @Autowired
    private PmsBaseCatalog2Service pmsBaseCatalog2Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("pms:pmsbasecatalog2:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsBaseCatalog2Service.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("pms:pmsbasecatalog2:info")
    public Result info(@PathVariable("id") Integer id){
        PmsBaseCatalog2Entity pmsBaseCatalog2 = pmsBaseCatalog2Service.getById(id);

        return Result.ok().put("pmsBaseCatalog2", pmsBaseCatalog2);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("pms:pmsbasecatalog2:save")
    public Result save(@RequestBody PmsBaseCatalog2Entity pmsBaseCatalog2){
        pmsBaseCatalog2Service.save(pmsBaseCatalog2);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("pms:pmsbasecatalog2:update")
    public Result update(@RequestBody PmsBaseCatalog2Entity pmsBaseCatalog2){
        //ValidatorUtils.validateEntity(pmsBaseCatalog2);
        pmsBaseCatalog2Service.updateById(pmsBaseCatalog2);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pms:pmsbasecatalog2:delete")
    public Result delete(@RequestBody Integer[] ids){
        pmsBaseCatalog2Service.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
