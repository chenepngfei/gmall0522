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

import com.afei.gmall.mamager.modules.pms.entity.PmsProductLadderEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductLadderService;




/**
 * 产品阶梯价格表(只针对同商品)
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsproductladder")
public class PmsProductLadderController {
    @Autowired
    private PmsProductLadderService pmsProductLadderService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsproductladder:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsProductLadderService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsproductladder:info")
    public Result info(@PathVariable("id") Long id){
        PmsProductLadderEntity pmsProductLadder = pmsProductLadderService.getById(id);

        return Result.ok().put("pmsProductLadder", pmsProductLadder);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsproductladder:save")
    public Result save(@RequestBody PmsProductLadderEntity pmsProductLadder){
        pmsProductLadderService.save(pmsProductLadder);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsproductladder:update")
    public Result update(@RequestBody PmsProductLadderEntity pmsProductLadder){
        //ValidatorUtils.validateEntity(pmsProductLadder);
        pmsProductLadderService.updateById(pmsProductLadder);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsproductladder:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsProductLadderService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
