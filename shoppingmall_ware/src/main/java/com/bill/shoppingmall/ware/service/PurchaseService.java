package com.bill.shoppingmall.ware.service;

import com.bill.shoppingmall.ware.vo.MergeVo;
import com.bill.shoppingmall.ware.vo.PurchaseDoneVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bill.common.utils.PageUtils;
import com.bill.shoppingmall.ware.entity.PurchaseEntity;

import java.util.List;
import java.util.Map;


public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPageUnreceivePurchase(Map<String, Object> params);


    void mergePurchase(MergeVo mergeVo);


    void received(List<Long> ids);


    void done(PurchaseDoneVo doneVo);


}

