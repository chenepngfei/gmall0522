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
import com.afei.gmall.mamager.modules.pms.entity.PmsProductSaleAttrValueEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductSaleAttrValueService;



/**
 * spu销售属性值
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsproductsaleattrvalue")
public class PmsProductSaleAttrValueController {
    @Autowired
    private PmsProductSaleAttrValueService pmsProductSaleAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsproductsaleattrvalue:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsProductSaleAttrValueService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsproductsaleattrvalue:info")
    public Result info(@PathVariable("id") Long id){
        PmsProductSaleAttrValueEntity pmsProductSaleAttrValue = pmsProductSaleAttrValueService.getById(id);

        return Result.ok().put("pmsProductSaleAttrValue", pmsProductSaleAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsproductsaleattrvalue:save")
    public Result save(@RequestBody PmsProductSaleAttrValueEntity pmsProductSaleAttrValue){
        pmsProductSaleAttrValueService.save(pmsProductSaleAttrValue);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsproductsaleattrvalue:update")
    public Result update(@RequestBody PmsProductSaleAttrValueEntity pmsProductSaleAttrValue){
        //ValidatorUtils.validateEntity(pmsProductSaleAttrValue);
        pmsProductSaleAttrValueService.updateById(pmsProductSaleAttrValue);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsproductsaleattrvalue:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsProductSaleAttrValueService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
