package com.afei.gmall.user.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;
import com.afei.gmall.common.utils.PageUtils;
import com.afei.gmall.common.utils.Result;
import com.afei.gmall.user.modules.sys.entity.UmsMemberProductCategoryRelationEntity;
import com.afei.gmall.user.modules.sys.service.UmsMemberProductCategoryRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @email chenpfmail@163.com
 * @date 2020-05-25 09:06:27
 */
@RestController
@RequestMapping("sys/umsmemberproductcategoryrelation")
public class UmsMemberProductCategoryRelationController {
    @Autowired
    private UmsMemberProductCategoryRelationService umsMemberProductCategoryRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberProductCategoryRelationService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Long id){
        UmsMemberProductCategoryRelationEntity umsMemberProductCategoryRelation = umsMemberProductCategoryRelationService.getById(id);

        return Result.ok().put("umsMemberProductCategoryRelation", umsMemberProductCategoryRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody UmsMemberProductCategoryRelationEntity umsMemberProductCategoryRelation){
        umsMemberProductCategoryRelationService.save(umsMemberProductCategoryRelation);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody UmsMemberProductCategoryRelationEntity umsMemberProductCategoryRelation){
       // ValidatorUtils.validateEntity(umsMemberProductCategoryRelation);
        umsMemberProductCategoryRelationService.updateById(umsMemberProductCategoryRelation);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Long[] ids){
        umsMemberProductCategoryRelationService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
