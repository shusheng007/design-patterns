package top.ss007.singleton;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/25 23:12
 * @description
 */
public class Singleton4 {
    private static volatile Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if(instance ==null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
