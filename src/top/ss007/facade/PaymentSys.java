package top.ss007.facade;

import java.math.BigDecimal;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/5 23:05
 * @description
 */
public class PaymentSys {

    private OrderSys orderSys;

    public PaymentSys(OrderSys orderSys) {
        this.orderSys = orderSys;
    }

    public BigDecimal getOrderAccount(String orderNum){
        System.out.println(String.format("获取%s订单支付金额",orderNum));
        return BigDecimal.valueOf(500);
    }
}
