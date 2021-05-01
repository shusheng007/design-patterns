package top.ss007.decorator;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/2 0:05
 * @description
 */
public class DecoratorClient {

    public void makeCoffee() {
        //原味咖啡
        ICoffee coffee = new OriginalCoffee();
        coffee.makeCoffee();
        System.out.println("");

        //加奶的咖啡
        coffee = new MilkDecorator(coffee);
        coffee.makeCoffee();
        System.out.println("");

        //先加奶后加糖的咖啡
        coffee = new SugarDecorator(coffee);
        coffee.makeCoffee();
    }
}
