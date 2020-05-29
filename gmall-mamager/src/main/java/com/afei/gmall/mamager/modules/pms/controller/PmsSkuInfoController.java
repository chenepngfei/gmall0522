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

import com.afei.gmall.mamager.modules.pms.entity.PmsSkuInfoEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsSkuInfoService;



/**
 * 库存单元表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsskuinfo")
public class PmsSkuInfoController {
    @Autowired
    private PmsSkuInfoService pmsSkuInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsskuinfo:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSkuInfoService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsskuinfo:info")
    public Result info(@PathVariable("id") Long id){
        PmsSkuInfoEntity pmsSkuInfo = pmsSkuInfoService.getById(id);

        return Result.ok().put("pmsSkuInfo", pmsSkuInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsskuinfo:save")
    public Result save(@RequestBody PmsSkuInfoEntity pmsSkuInfo){
        pmsSkuInfoService.save(pmsSkuInfo);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsskuinfo:update")
    public Result update(@RequestBody PmsSkuInfoEntity pmsSkuInfo){
        //ValidatorUtils.validateEntity(pmsSkuInfo);
        pmsSkuInfoService.updateById(pmsSkuInfo);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsskuinfo:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsSkuInfoService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
