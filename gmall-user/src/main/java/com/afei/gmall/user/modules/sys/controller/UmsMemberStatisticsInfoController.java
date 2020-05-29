package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;
import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsMemberStatisticsInfoEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberStatisticsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 会员统计信息
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@RestController
@RequestMapping("sys/umsmemberstatisticsinfo")
public class UmsMemberStatisticsInfoController {
    @Autowired
    private UmsMemberStatisticsInfoService umsMemberStatisticsInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberStatisticsInfoService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
        UmsMemberStatisticsInfoEntity umsMemberStatisticsInfo = umsMemberStatisticsInfoService.getById(id);

        return Result.ok().put("umsMemberStatisticsInfo", umsMemberStatisticsInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody UmsMemberStatisticsInfoEntity umsMemberStatisticsInfo){
        umsMemberStatisticsInfoService.save(umsMemberStatisticsInfo);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody UmsMemberStatisticsInfoEntity umsMemberStatisticsInfo){
       // ValidatorUtils.validateEntity(umsMemberStatisticsInfo);
        umsMemberStatisticsInfoService.updateById(umsMemberStatisticsInfo);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
        umsMemberStatisticsInfoService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
