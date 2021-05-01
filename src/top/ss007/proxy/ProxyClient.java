package top.ss007.proxy;

import top.ss007.proxy.dynamicproxy.CuiHuaNiu;
import top.ss007.proxy.dynamicproxy.DynProxyLawyer;
import top.ss007.proxy.statictproxy.DogWang2;
import top.ss007.proxy.statictproxy.ProxyLawyer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/2 0:18
 * @description
 */
public class ProxyClient {

    public void doyWang2IndictBos() {
        System.out.println("王二狗通过代理律师起诉马旭：");
        ILawSuit lawyer = new ProxyLawyer(new DogWang2());
        lawyer.submit("工资流水在此");
        lawyer.defend();
    }

    public void cuiHuaNiuIndictBos() {
        System.out.println("牛翠花通过代理律师起诉马旭：");
        CuiHuaNiu cuiHuaNiu = new CuiHuaNiu();
        InvocationHandler handler = new DynProxyLawyer(cuiHuaNiu);
        ILawSuit lawyer = (ILawSuit) Proxy.newProxyInstance(cuiHuaNiu.getClass().getClassLoader(),
                cuiHuaNiu.getClass().getInterfaces(), handler);

        lawyer.submit("工资流水在此");
        lawyer.defend();
    }


}
