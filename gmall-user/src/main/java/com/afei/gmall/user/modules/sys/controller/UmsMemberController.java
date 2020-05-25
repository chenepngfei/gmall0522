package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import com.afei.gmall.user.common.utils.PageUtils;
import com.afei.gmall.user.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsMemberEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 会员表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:37:43
 */
@RestController
@RequestMapping("sys/umsmember")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("sys:umsmember:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("sys:umsmember:info")
    public Result info(@PathVariable("id") Long id){
        UmsMemberEntity umsMember = umsMemberService.getById(id);

        return Result.ok().put("umsMember", umsMember);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("sys:umsmember:save")
    public Result save(@RequestBody UmsMemberEntity umsMember){
        umsMemberService.save(umsMember);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("sys:umsmember:update")
    public Result update(@RequestBody UmsMemberEntity umsMember){
        //ValidatorUtils.validateEntity(umsMember);
        umsMemberService.updateById(umsMember);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("sys:umsmember:delete")
    public Result delete(@RequestBody Long[] ids){
        umsMemberService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
