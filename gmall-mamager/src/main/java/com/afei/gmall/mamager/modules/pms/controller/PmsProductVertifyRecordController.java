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

import com.afei.gmall.mamager.modules.pms.entity.PmsProductVertifyRecordEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductVertifyRecordService;



/**
 * 商品审核记录
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsproductvertifyrecord")
public class PmsProductVertifyRecordController {
    @Autowired
    private PmsProductVertifyRecordService pmsProductVertifyRecordService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsproductvertifyrecord:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsProductVertifyRecordService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsproductvertifyrecord:info")
    public Result info(@PathVariable("id") Long id){
        PmsProductVertifyRecordEntity pmsProductVertifyRecord = pmsProductVertifyRecordService.getById(id);

        return Result.ok().put("pmsProductVertifyRecord", pmsProductVertifyRecord);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsproductvertifyrecord:save")
    public Result save(@RequestBody PmsProductVertifyRecordEntity pmsProductVertifyRecord){
        pmsProductVertifyRecordService.save(pmsProductVertifyRecord);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsproductvertifyrecord:update")
    public Result update(@RequestBody PmsProductVertifyRecordEntity pmsProductVertifyRecord){
        //ValidatorUtils.validateEntity(pmsProductVertifyRecord);
        pmsProductVertifyRecordService.updateById(pmsProductVertifyRecord);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsproductvertifyrecord:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsProductVertifyRecordService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
