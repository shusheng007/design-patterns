package top.ss007.strategy;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/1 23:21
 * @description 乘坐公交车算法
 */

public class ByBus implements CalculateStrategy {
    @Override
    public int calculateTrafficFee(int distance) {
        return distance < 10 ? 4 : 6;
    }
}

