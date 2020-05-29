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
import com.afei.gmall.mamager.modules.pms.entity.PmsProductImageEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductImageService;




/**
 * 商品图片表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsproductimage")
public class PmsProductImageController {
    @Autowired
    private PmsProductImageService pmsProductImageService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsproductimage:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsProductImageService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsproductimage:info")
    public Result info(@PathVariable("id") Long id){
        PmsProductImageEntity pmsProductImage = pmsProductImageService.getById(id);

        return Result.ok().put("pmsProductImage", pmsProductImage);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsproductimage:save")
    public Result save(@RequestBody PmsProductImageEntity pmsProductImage){
        pmsProductImageService.save(pmsProductImage);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsproductimage:update")
    public Result update(@RequestBody PmsProductImageEntity pmsProductImage){
        //ValidatorUtils.validateEntity(pmsProductImage);
        pmsProductImageService.updateById(pmsProductImage);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsproductimage:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsProductImageService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
