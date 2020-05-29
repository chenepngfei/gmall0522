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
import com.afei.gmall.mamager.modules.pms.entity.PmsProductSaleAttrEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductSaleAttrService;


/**
 *
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsproductsaleattr")
public class PmsProductSaleAttrController {
    @Autowired
    private PmsProductSaleAttrService pmsProductSaleAttrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsproductsaleattr:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsProductSaleAttrService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsproductsaleattr:info")
    public Result info(@PathVariable("id") Long id){
        PmsProductSaleAttrEntity pmsProductSaleAttr = pmsProductSaleAttrService.getById(id);

        return Result.ok().put("pmsProductSaleAttr", pmsProductSaleAttr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsproductsaleattr:save")
    public Result save(@RequestBody PmsProductSaleAttrEntity pmsProductSaleAttr){
        pmsProductSaleAttrService.save(pmsProductSaleAttr);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsproductsaleattr:update")
    public Result update(@RequestBody PmsProductSaleAttrEntity pmsProductSaleAttr){
        //ValidatorUtils.validateEntity(pmsProductSaleAttr);
        pmsProductSaleAttrService.updateById(pmsProductSaleAttr);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsproductsaleattr:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsProductSaleAttrService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
