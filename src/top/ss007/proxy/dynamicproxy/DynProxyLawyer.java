package top.ss007.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/2 0:22
 * @description
 */
public class DynProxyLawyer implements InvocationHandler {
    private Object target;//被代理的对象

    public DynProxyLawyer(Object obj) {
        this.target = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("案件进展：" + method.getName());
        Object result = method.invoke(target, args);
        return result;
    }
}

