package com.bill.shoppingmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bill.common.utils.PageUtils;
import com.bill.shoppingmall.order.entity.OrderEntity;

import java.util.Map;

public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

