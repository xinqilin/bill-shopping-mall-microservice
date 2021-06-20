package com.bill.shoppingmall.order.dao;

import com.bill.shoppingmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
