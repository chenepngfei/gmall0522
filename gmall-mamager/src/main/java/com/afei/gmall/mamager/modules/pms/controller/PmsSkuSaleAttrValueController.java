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
import com.afei.gmall.mamager.modules.pms.entity.PmsSkuSaleAttrValueEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsSkuSaleAttrValueService;


/**
 * sku销售属性值
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsskusaleattrvalue")
public class PmsSkuSaleAttrValueController {
    @Autowired
    private PmsSkuSaleAttrValueService pmsSkuSaleAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsskusaleattrvalue:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSkuSaleAttrValueService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsskusaleattrvalue:info")
    public Result info(@PathVariable("id") Long id){
        PmsSkuSaleAttrValueEntity pmsSkuSaleAttrValue = pmsSkuSaleAttrValueService.getById(id);

        return Result.ok().put("pmsSkuSaleAttrValue", pmsSkuSaleAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsskusaleattrvalue:save")
    public Result save(@RequestBody PmsSkuSaleAttrValueEntity pmsSkuSaleAttrValue){
        pmsSkuSaleAttrValueService.save(pmsSkuSaleAttrValue);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsskusaleattrvalue:update")
    public Result update(@RequestBody PmsSkuSaleAttrValueEntity pmsSkuSaleAttrValue){
        //ValidatorUtils.validateEntity(pmsSkuSaleAttrValue);
        pmsSkuSaleAttrValueService.updateById(pmsSkuSaleAttrValue);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsskusaleattrvalue:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsSkuSaleAttrValueService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
