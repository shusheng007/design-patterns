package top.ss007.proxy;

/**
 * Created by Ben.Wang on 2018/6/27.
 */

public class RealSubject implements Subject {
    @Override
    public void dealTask(String taskName) {
        System.out.println("正在执行任务："+taskName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sayHello(String content) {
        System.out.println("app say: "+content);
    }
}
