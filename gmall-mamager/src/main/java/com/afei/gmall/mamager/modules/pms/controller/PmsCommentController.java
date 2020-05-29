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
import com.afei.gmall.mamager.modules.pms.entity.PmsCommentEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsCommentService;


/**
 * 商品评价表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmscomment")
public class PmsCommentController {
    @Autowired
    private PmsCommentService pmsCommentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("pms:pmscomment:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsCommentService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("pms:pmscomment:info")
    public Result info(@PathVariable("id") Long id){
        PmsCommentEntity pmsComment = pmsCommentService.getById(id);

        return Result.ok().put("pmsComment", pmsComment);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("pms:pmscomment:save")
    public Result save(@RequestBody PmsCommentEntity pmsComment){
        pmsCommentService.save(pmsComment);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pms:pmscomment:update")
    public Result update(@RequestBody PmsCommentEntity pmsComment){
        //ValidatorUtils.validateEntity(pmsComment);
        pmsCommentService.updateById(pmsComment);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pms:pmscomment:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsCommentService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
