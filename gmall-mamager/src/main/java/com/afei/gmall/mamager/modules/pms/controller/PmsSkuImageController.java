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

import com.afei.gmall.mamager.modules.pms.entity.PmsSkuImageEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsSkuImageService;



/**
 * 库存单元图片表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsskuimage")
public class PmsSkuImageController {
    @Autowired
    private PmsSkuImageService pmsSkuImageService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsskuimage:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSkuImageService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsskuimage:info")
    public Result info(@PathVariable("id") Long id){
        PmsSkuImageEntity pmsSkuImage = pmsSkuImageService.getById(id);

        return Result.ok().put("pmsSkuImage", pmsSkuImage);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsskuimage:save")
    public Result save(@RequestBody PmsSkuImageEntity pmsSkuImage){
        pmsSkuImageService.save(pmsSkuImage);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsskuimage:update")
    public Result update(@RequestBody PmsSkuImageEntity pmsSkuImage){
        //ValidatorUtils.validateEntity(pmsSkuImage);
        pmsSkuImageService.updateById(pmsSkuImage);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsskuimage:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsSkuImageService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
