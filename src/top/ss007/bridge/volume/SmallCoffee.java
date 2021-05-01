package top.ss007.bridge.volume;

import top.ss007.bridge.additives.ICoffeeAdditives;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/1 16:49
 * @description
 */
public class SmallCoffee extends RefinedCoffee {
    public SmallCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    @Override
    public void orderCoffee(int count) {
        additives.addSomething();
        System.out.println(String.format("小杯咖啡%d杯",count));
    }
}
