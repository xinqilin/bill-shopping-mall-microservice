package com.bill.shoppingmall.product.service;

import com.bill.shoppingmall.product.vo.AttrGroupRelationVo;
import com.bill.shoppingmall.product.vo.AttrRespVo;
import com.bill.shoppingmall.product.vo.AttrVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bill.common.utils.PageUtils;
import com.bill.shoppingmall.product.entity.AttrEntity;

import java.util.List;
import java.util.Map;


public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);

}

