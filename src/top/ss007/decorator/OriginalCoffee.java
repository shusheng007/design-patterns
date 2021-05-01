package top.ss007.decorator;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/2 0:01
 * @description
 */
public class OriginalCoffee implements ICoffee {
    @Override
    public void makeCoffee() {
        System.out.print("原味咖啡 ");
    }
}
