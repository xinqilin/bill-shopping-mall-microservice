package com.bill.shoppingmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bill.common.utils.PageUtils;
import com.bill.shoppingmall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

