package com.bill.shoppingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bill.common.utils.PageUtils;
import com.bill.shoppingmall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;


public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);



    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity category);

}

