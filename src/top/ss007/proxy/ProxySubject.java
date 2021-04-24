package top.ss007.proxy;

/**
 * Created by Ben.Wang on 2018/6/27.
 */
public class ProxySubject implements Subject {

    private Subject delegate;

    public ProxySubject(Subject dele)
    {
        this.delegate=dele;
    }
    @Override
    public void dealTask(String taskName) {
        long stime = System.currentTimeMillis();
        delegate.dealTask(taskName);//将请求分派给委托类处理
        long ftime = System.currentTimeMillis();
        System.out.println("执行任务耗时"+(ftime - stime)+"毫秒");
    }

    @Override
    public void sayHello(String content) {
        delegate.sayHello(content);
    }
}
