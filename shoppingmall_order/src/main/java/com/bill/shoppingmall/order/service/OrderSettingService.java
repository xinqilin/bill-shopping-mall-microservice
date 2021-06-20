package com.bill.shoppingmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bill.common.utils.PageUtils;
import com.bill.shoppingmall.order.entity.OrderSettingEntity;

import java.util.Map;

public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

