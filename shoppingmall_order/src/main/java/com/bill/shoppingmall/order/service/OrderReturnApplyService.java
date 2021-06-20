package com.bill.shoppingmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bill.common.utils.PageUtils;
import com.bill.shoppingmall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

