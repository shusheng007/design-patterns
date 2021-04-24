package top.ss007.proxy;

/**
 * Created by Ben.Wang on 2018/6/27.
 */
public interface Subject {

    void dealTask(String taskName);

    void sayHello(String content);

    //Proxy ; InvocationHandler

}
