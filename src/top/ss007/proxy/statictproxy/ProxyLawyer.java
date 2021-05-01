package top.ss007.proxy.statictproxy;

import top.ss007.proxy.ILawSuit;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/2 0:16
 * @description
 */
public class ProxyLawyer implements ILawSuit {

    ILawSuit plaintiff;//持有要代理的那个对象

    public ProxyLawyer(ILawSuit plaintiff) {
        this.plaintiff = plaintiff;
    }

    @Override
    public void submit(String proof) {
        plaintiff.submit(proof);
    }

    @Override
    public void defend() {
        plaintiff.defend();
    }
}

