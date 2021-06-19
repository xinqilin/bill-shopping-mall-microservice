package com.bill.shoppingmall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bill.shoppingmall.coupon.entity.CouponEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
