package top.ss007.singleton;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/30 9:50
 * @description
 */
public class SingletonClient {

    public void run() {
        final Singleton5 instance1 = Singleton5.getInstance();
        final Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(String.format("实例1：%s 实例2：%s | 是否是同一实例：%s",
                instance1, instance1, instance1 == instance2));
    }
}
