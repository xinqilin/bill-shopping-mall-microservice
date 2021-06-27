/**
  * Copyright 2019 bejson.com 
  */
package com.bill.shoppingmall.product.vo;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

}