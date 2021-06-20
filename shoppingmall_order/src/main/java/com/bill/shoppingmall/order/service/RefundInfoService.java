package com.bill.shoppingmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bill.common.utils.PageUtils;
import com.bill.shoppingmall.order.entity.RefundInfoEntity;

import java.util.Map;

public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

