package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;
import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsMemberTagEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 用户标签表
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@RestController
@RequestMapping("sys/umsmembertag")
public class UmsMemberTagController {
    @Autowired
    private UmsMemberTagService umsMemberTagService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberTagService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
        UmsMemberTagEntity umsMemberTag = umsMemberTagService.getById(id);

        return Result.ok().put("umsMemberTag", umsMemberTag);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody UmsMemberTagEntity umsMemberTag){
        umsMemberTagService.save(umsMemberTag);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody UmsMemberTagEntity umsMemberTag){
        //ValidatorUtils.validateEntity(umsMemberTag);
        umsMemberTagService.updateById(umsMemberTag);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
        umsMemberTagService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
