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

    private int calculateTrafficFee(CalculateStrategy strategy, int distance){
        return strategy.calculateTrafficFee(distance);
    }

    public void listFeeToTianJinEye(){
        System.out.println(String.format("乘坐公交车到天津之眼的花费为：%d块人民币",
                calculateTrafficFee(new ByBus(),10)));
        System.out.println(String.format("乘坐滴滴快车到天津之眼的花费为：%d块人民币",
                calculateTrafficFee(new ByDiDiExpress(),10)));
        System.out.println(String.format("骑共享单车到天津之眼的花费为：%d块人民币",
                calculateTrafficFee(new BySharedBicycle(),10)));
    }
}
