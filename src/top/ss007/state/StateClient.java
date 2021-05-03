package top.ss007.state;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/3 11:11
 * @description
 */
public class StateClient {

    public void buyKeyboard() {
        //状态的保持与切换者
        JdLogistics jdLogistics = new JdLogistics();

        //接单状态
        OrderState orderState = new OrderState();
        jdLogistics.setLogisticsState(orderState);
        jdLogistics.doAction();

        //出库状态
        ProductOutState productOutState = new ProductOutState();
        jdLogistics.setLogisticsState(productOutState);
        jdLogistics.doAction();

        //运输状态
        TransportState transportState = new TransportState();
        jdLogistics.setLogisticsState(transportState);
        jdLogistics.doAction();

    }
}
