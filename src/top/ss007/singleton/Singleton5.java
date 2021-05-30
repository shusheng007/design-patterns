package top.ss007.singleton;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/25 23:12
 * @description
 */
public class Singleton5 {

    private Singleton5() {
    }

    private static class SingletonInstance {
        private final static Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
