package top.ss007.state;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/3 11:07
 * @description
 */
public class ProductOutState implements LogisticsState {
    @Override
    public void doAction(JdLogistics context) {
        System.out.println("商品已经出库...");
    }
}
