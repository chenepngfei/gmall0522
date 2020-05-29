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
import com.afei.gmall.mamager.modules.pms.entity.PmsMemberPriceEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsMemberPriceService;



/**
 * 商品会员价格表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsmemberprice")
public class PmsMemberPriceController {
    @Autowired
    private PmsMemberPriceService pmsMemberPriceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsmemberprice:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsMemberPriceService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsmemberprice:info")
    public Result info(@PathVariable("id") Long id){
        PmsMemberPriceEntity pmsMemberPrice = pmsMemberPriceService.getById(id);

        return Result.ok().put("pmsMemberPrice", pmsMemberPrice);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsmemberprice:save")
    public Result save(@RequestBody PmsMemberPriceEntity pmsMemberPrice){
        pmsMemberPriceService.save(pmsMemberPrice);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsmemberprice:update")
    public Result update(@RequestBody PmsMemberPriceEntity pmsMemberPrice){
        //ValidatorUtils.validateEntity(pmsMemberPrice);
        pmsMemberPriceService.updateById(pmsMemberPrice);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsmemberprice:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsMemberPriceService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
