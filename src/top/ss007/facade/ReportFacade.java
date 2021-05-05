package top.ss007.facade;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/5 23:12
 * @description
 */
public class ReportFacade {

    public void generateReport() {
        OrderSys orderSys = new OrderSys();
        PaymentSys paymentSys = new PaymentSys(orderSys);
        DeliverySys deliverySys = new DeliverySys();

        final String orderNum = orderSys.getOrderNum();
        System.out.println(String.format("\n报表\n--------------------------------------------\n" +
                        "订单号：%s | 金额：%s元 | 配送耗时：%s分钟",
                orderNum,
                paymentSys.getOrderAccount(orderNum).toPlainString(),
                String.valueOf(deliverySys.getDeliveryTime() / 60))
        );
    }
}
