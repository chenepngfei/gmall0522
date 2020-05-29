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
import com.afei.gmall.mamager.modules.pms.entity.PmsFeightTemplateEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsFeightTemplateService;



/**
 * 运费模版
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsfeighttemplate")
public class PmsFeightTemplateController {
    @Autowired
    private PmsFeightTemplateService pmsFeightTemplateService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsfeighttemplate:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsFeightTemplateService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsfeighttemplate:info")
    public Result info(@PathVariable("id") Long id){
        PmsFeightTemplateEntity pmsFeightTemplate = pmsFeightTemplateService.getById(id);

        return Result.ok().put("pmsFeightTemplate", pmsFeightTemplate);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsfeighttemplate:save")
    public Result save(@RequestBody PmsFeightTemplateEntity pmsFeightTemplate){
        pmsFeightTemplateService.save(pmsFeightTemplate);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsfeighttemplate:update")
    public Result update(@RequestBody PmsFeightTemplateEntity pmsFeightTemplate){
        //ValidatorUtils.validateEntity(pmsFeightTemplate);
        pmsFeightTemplateService.updateById(pmsFeightTemplate);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsfeighttemplate:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsFeightTemplateService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
