package top.ss007.strategy;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/1 23:25
 * @description
 */
public class StrategyClient {

    public void listFeeToTianJinEye(){
        TransportFeeCalculator calculator =new TransportFeeCalculator();

        calculator.setCalculateStrategy(new BySharedBicycle());
        System.out.println(String.format("骑共享单车到天津之眼的花费为：%d块人民币",
                calculator.getTransportFee(10)));

        calculator.setCalculateStrategy(new ByBus());
        System.out.println(String.format("乘坐公交车到天津之眼的花费为：%d块人民币",
                calculator.getTransportFee(12)));

        calculator.setCalculateStrategy(new ByDiDiExpress());
        System.out.println(String.format("乘坐滴滴快车到天津之眼的花费为：%d块人民币",
                calculator.getTransportFee(13)));

    }
}
