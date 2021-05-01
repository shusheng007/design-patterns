package top.ss007.adapter;

/**
 * Created by Ben.Wang
 * <p>
 * author     : Ben.Wang
 * date       : 2021/4/25 11:27
 * description:
 */
public class NbLoggerImp implements NbLogger {
    @Override
    public void d(int priority, String message, Object... obj) {
        System.out.println(String.format("牛逼logger记录:%s",message));
    }
}
