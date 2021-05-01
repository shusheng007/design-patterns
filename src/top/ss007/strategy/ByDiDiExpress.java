package top.ss007.strategy;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/1 23:22
 * @description 乘坐滴滴快车算法
 *
 * 小于3公里8块，大于3公里 起步费8块+每公里3块
 */
public class ByDiDiExpress implements CalculateStrategy {
    @Override
    public int calculateTrafficFee(int distance) {
        return distance < 3 ? 8 : (8 + (distance - 3) * 3);
    }
}

