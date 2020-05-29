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
import com.afei.gmall.mamager.modules.pms.entity.PmsBrandEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsBrandService;



/**
 * 品牌表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsbrand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService pmsBrandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("pms:pmsbrand:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsBrandService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("pms:pmsbrand:info")
    public Result info(@PathVariable("id") Long id){
        PmsBrandEntity pmsBrand = pmsBrandService.getById(id);

        return Result.ok().put("pmsBrand", pmsBrand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("pms:pmsbrand:save")
    public Result save(@RequestBody PmsBrandEntity pmsBrand){
        pmsBrandService.save(pmsBrand);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("pms:pmsbrand:update")
    public Result update(@RequestBody PmsBrandEntity pmsBrand){
        //ValidatorUtils.validateEntity(pmsBrand);
        pmsBrandService.updateById(pmsBrand);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pms:pmsbrand:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsBrandService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
