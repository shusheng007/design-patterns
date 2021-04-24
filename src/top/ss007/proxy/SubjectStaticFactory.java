package top.ss007.proxy;

/**
 * Created by Ben.Wang on 2018/6/27.
 */
public class SubjectStaticFactory {

    public static ProxySubject getInstance() {
        return new ProxySubject(new RealSubject());
    }
}
