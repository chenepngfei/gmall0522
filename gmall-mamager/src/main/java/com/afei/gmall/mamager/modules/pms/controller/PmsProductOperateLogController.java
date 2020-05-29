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
import com.afei.gmall.mamager.modules.pms.entity.PmsProductOperateLogEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsProductOperateLogService;



/**
 *
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmsproductoperatelog")
public class PmsProductOperateLogController {
    @Autowired
    private PmsProductOperateLogService pmsProductOperateLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmsproductoperatelog:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsProductOperateLogService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmsproductoperatelog:info")
    public Result info(@PathVariable("id") Long id){
        PmsProductOperateLogEntity pmsProductOperateLog = pmsProductOperateLogService.getById(id);

        return Result.ok().put("pmsProductOperateLog", pmsProductOperateLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmsproductoperatelog:save")
    public Result save(@RequestBody PmsProductOperateLogEntity pmsProductOperateLog){
        pmsProductOperateLogService.save(pmsProductOperateLog);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmsproductoperatelog:update")
    public Result update(@RequestBody PmsProductOperateLogEntity pmsProductOperateLog){
        //ValidatorUtils.validateEntity(pmsProductOperateLog);
        pmsProductOperateLogService.updateById(pmsProductOperateLog);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmsproductoperatelog:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsProductOperateLogService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
