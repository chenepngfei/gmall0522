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
import com.afei.gmall.mamager.modules.pms.entity.PmsSkuAttrValueEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsSkuAttrValueService;



/**
 * sku平台属性值关联表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsskuattrvalue")
public class PmsSkuAttrValueController {
    @Autowired
    private PmsSkuAttrValueService pmsSkuAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsskuattrvalue:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSkuAttrValueService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsskuattrvalue:info")
    public Result info(@PathVariable("id") Long id){
        PmsSkuAttrValueEntity pmsSkuAttrValue = pmsSkuAttrValueService.getById(id);

        return Result.ok().put("pmsSkuAttrValue", pmsSkuAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsskuattrvalue:save")
    public Result save(@RequestBody PmsSkuAttrValueEntity pmsSkuAttrValue){
        pmsSkuAttrValueService.save(pmsSkuAttrValue);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsskuattrvalue:update")
    public Result update(@RequestBody PmsSkuAttrValueEntity pmsSkuAttrValue){
        //ValidatorUtils.validateEntity(pmsSkuAttrValue);
        pmsSkuAttrValueService.updateById(pmsSkuAttrValue);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsskuattrvalue:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsSkuAttrValueService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
