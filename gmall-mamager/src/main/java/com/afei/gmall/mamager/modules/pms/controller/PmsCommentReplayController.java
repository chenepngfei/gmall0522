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
import com.afei.gmall.mamager.modules.pms.entity.PmsCommentReplayEntity;
import com.afei.gmall.mamager.modules.pms.service.PmsCommentReplayService;



/**
 * 产品评价回复表
 *
 * @author cpf
 * @email chenpfmail@163.com
 * @date 2020-05-27 13:52:05
 */
@RestController
@RequestMapping("pms/pmscommentreplay")
public class PmsCommentReplayController {
    @Autowired
    private PmsCommentReplayService pmsCommentReplayService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   //  @RequiresPermissions("pms:pmscommentreplay:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsCommentReplayService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   //  @RequiresPermissions("pms:pmscommentreplay:info")
    public Result info(@PathVariable("id") Long id){
        PmsCommentReplayEntity pmsCommentReplay = pmsCommentReplayService.getById(id);

        return Result.ok().put("pmsCommentReplay", pmsCommentReplay);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   //  @RequiresPermissions("pms:pmscommentreplay:save")
    public Result save(@RequestBody PmsCommentReplayEntity pmsCommentReplay){
        pmsCommentReplayService.save(pmsCommentReplay);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //  @RequiresPermissions("pms:pmscommentreplay:update")
    public Result update(@RequestBody PmsCommentReplayEntity pmsCommentReplay){
        //ValidatorUtils.validateEntity(pmsCommentReplay);
        pmsCommentReplayService.updateById(pmsCommentReplay);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   //  @RequiresPermissions("pms:pmscommentreplay:delete")
    public Result delete(@RequestBody Long[] ids){
        pmsCommentReplayService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
