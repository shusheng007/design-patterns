package top.ss007.iterator;

import java.util.Iterator;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/6/14 15:31
 * @description
 */
public class IteratorClient {

    public void checkAttendance(){
        Class cls= new Class();
        System.out.println("--------------开始点名--------------");
        Iterator<Student> iterator= cls.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
