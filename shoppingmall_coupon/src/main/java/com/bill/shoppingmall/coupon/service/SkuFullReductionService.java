package com.bill.shoppingmall.coupon.service;

import com.bill.common.to.SkuReductionTo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bill.common.utils.PageUtils;
import com.bill.shoppingmall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;


public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo reductionTo);


}

