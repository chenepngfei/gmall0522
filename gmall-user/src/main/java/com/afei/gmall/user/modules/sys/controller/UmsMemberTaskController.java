package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;
import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsMemberTaskEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 会员任务表
 *
 * @author Mark
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@RestController
@RequestMapping("sys/umsmembertask")
public class UmsMemberTaskController {
    @Autowired
    private UmsMemberTaskService umsMemberTaskService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberTaskService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
        UmsMemberTaskEntity umsMemberTask = umsMemberTaskService.getById(id);

        return Result.ok().put("umsMemberTask", umsMemberTask);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody UmsMemberTaskEntity umsMemberTask){
        umsMemberTaskService.save(umsMemberTask);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody UmsMemberTaskEntity umsMemberTask){
      //  ValidatorUtils.validateEntity(umsMemberTask);
        umsMemberTaskService.updateById(umsMemberTask);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
        umsMemberTaskService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
