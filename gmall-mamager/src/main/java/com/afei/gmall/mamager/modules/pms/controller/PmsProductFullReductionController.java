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
import com.afei.gmall.mamager.modules.pms.entity.PmsProductFullReductionEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductFullReductionService;



/**
 * 产品满减表(只针对同商品)
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsproductfullreduction")
public class PmsProductFullReductionController {
    @Autowired
    private PmsProductFullReductionService pmsProductFullReductionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsproductfullreduction:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsProductFullReductionService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsproductfullreduction:info")
    public Result info(@PathVariable("id") Long id){
        PmsProductFullReductionEntity pmsProductFullReduction = pmsProductFullReductionService.getById(id);

        return Result.ok().put("pmsProductFullReduction", pmsProductFullReduction);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsproductfullreduction:save")
    public Result save(@RequestBody PmsProductFullReductionEntity pmsProductFullReduction){
        pmsProductFullReductionService.save(pmsProductFullReduction);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsproductfullreduction:update")
    public Result update(@RequestBody PmsProductFullReductionEntity pmsProductFullReduction){
        //ValidatorUtils.validateEntity(pmsProductFullReduction);
        pmsProductFullReductionService.updateById(pmsProductFullReduction);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsproductfullreduction:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsProductFullReductionService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
