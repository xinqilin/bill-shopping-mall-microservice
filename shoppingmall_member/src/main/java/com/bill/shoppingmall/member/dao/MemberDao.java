package com.bill.shoppingmall.member.dao;

import com.bill.shoppingmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
