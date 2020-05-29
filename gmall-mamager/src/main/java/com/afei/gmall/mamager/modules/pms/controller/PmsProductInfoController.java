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
import com.afei.gmall.mamager.modules.pms.entity.PmsProductInfoEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductInfoService;




/**
 *
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsproductinfo")
public class PmsProductInfoController {
    @Autowired
    private PmsProductInfoService pmsProductInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsproductinfo:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsProductInfoService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsproductinfo:info")
    public Result info(@PathVariable("id") Long id){
        PmsProductInfoEntity pmsProductInfo = pmsProductInfoService.getById(id);

        return Result.ok().put("pmsProductInfo", pmsProductInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsproductinfo:save")
    public Result save(@RequestBody PmsProductInfoEntity pmsProductInfo){
        pmsProductInfoService.save(pmsProductInfo);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsproductinfo:update")
    public Result update(@RequestBody PmsProductInfoEntity pmsProductInfo){
        //ValidatorUtils.validateEntity(pmsProductInfo);
        pmsProductInfoService.updateById(pmsProductInfo);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsproductinfo:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsProductInfoService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
