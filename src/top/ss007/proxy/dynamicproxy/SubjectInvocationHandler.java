package top.ss007.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Ben.Wang on 2018/6/27.
 */
public class SubjectInvocationHandler implements InvocationHandler {
    private Object sub;

    public SubjectInvocationHandler(Object obj)
    {
        sub=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long sTime=System.currentTimeMillis();
        method.invoke(sub,args);
        long eTime=System.currentTimeMillis();
        System.out.println("执行任务耗时"+(eTime - sTime)+"毫秒");
        return null;
    }
}
