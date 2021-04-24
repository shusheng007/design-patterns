package top.ss007.proxy;

/**
 * Created by Ben.Wang on 2018/6/28.
 */
public class House {
    Person p = new Person("ben");

    public House() {
        p2 = new Person("lili");
    }

    Person p2 = new Person("frank");
}

class Person {

    Person(String name) {
        System.out.println(String.format("I am %s", name));
    }
}
