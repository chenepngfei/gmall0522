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
import com.afei.gmall.mamager.modules.pms.entity.PmsBaseCatalog3Entity;
import com.afei.gmall.mamager.modules.pms.service.PmsBaseCatalog3Service;



/**
 *
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsbasecatalog3")
public class PmsBaseCatalog3Controller {
    @Autowired
    private PmsBaseCatalog3Service pmsBaseCatalog3Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("pms:pmsbasecatalog3:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsBaseCatalog3Service.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("pms:pmsbasecatalog3:info")
    public Result info(@PathVariable("id") Long id){
        PmsBaseCatalog3Entity pmsBaseCatalog3 = pmsBaseCatalog3Service.getById(id);

        return Result.ok().put("pmsBaseCatalog3", pmsBaseCatalog3);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("pms:pmsbasecatalog3:save")
    public Result save(@RequestBody PmsBaseCatalog3Entity pmsBaseCatalog3){
        pmsBaseCatalog3Service.save(pmsBaseCatalog3);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("pms:pmsbasecatalog3:update")
    public Result update(@RequestBody PmsBaseCatalog3Entity pmsBaseCatalog3){
        //ValidatorUtils.validateEntity(pmsBaseCatalog3);
        pmsBaseCatalog3Service.updateById(pmsBaseCatalog3);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pms:pmsbasecatalog3:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsBaseCatalog3Service.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
