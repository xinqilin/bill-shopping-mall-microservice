/**
  * Copyright 2019 bejson.com 
  */
package com.bill.shoppingmall.product.vo;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class Bounds {

    private BigDecimal buyBounds;
    private BigDecimal growBounds;


}