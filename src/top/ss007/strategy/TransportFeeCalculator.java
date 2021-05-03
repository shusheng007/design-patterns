package top.ss007.strategy;

import java.util.Objects;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/3 11:28
 * @description
 */
public class TransportFeeCalculator {

    private CalculateStrategy calculateStrategy;

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public int getTransportFee(int distance){
        Objects.requireNonNull(calculateStrategy);
        return calculateStrategy.calculateTrafficFee(distance);
    }
}
