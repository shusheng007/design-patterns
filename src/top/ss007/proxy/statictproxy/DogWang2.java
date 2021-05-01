package top.ss007.proxy.statictproxy;

import top.ss007.proxy.ILawSuit;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/2 0:15
 * @description
 */
public class DogWang2 implements ILawSuit {
    @Override
    public void submit(String proof) {
        System.out.println(String.format("老板欠薪跑路，证据如下：%s",proof));
    }

    @Override
    public void defend() {
        System.out.println(String.format("铁证如山，%s还王二狗血汗钱","马旭"));
    }
}
