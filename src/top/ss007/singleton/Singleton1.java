package top.ss007.singleton;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/25 23:12
 * @description
 */
public class Singleton1 {
    private final static Singleton1 INSTANCE= new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        return INSTANCE;
    }
}
