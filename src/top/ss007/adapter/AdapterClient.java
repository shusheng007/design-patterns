package top.ss007.adapter;

/**
 * Created by Ben.Wang
 * <p>
 * author     : Ben.Wang
 * date       : 2021/4/25 11:35
 * description:
 */
public class AdapterClient {

    public void recordLog() {
        LogFactory logFactory = new LogAdapter(new NbLoggerImp());
        logFactory.debug("Test", "我将使用牛逼logger打印log");
    }
}
