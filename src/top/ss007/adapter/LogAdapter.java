package top.ss007.adapter;

import java.util.Objects;

/**
 * Created by Ben.Wang
 * <p>
 * author     : Ben.Wang
 * date       : 2021/4/25 11:30
 * description:
 */
public class LogAdapter implements LogFactory {
    private NbLogger nbLogger;

    public LogAdapter(NbLogger nbLogger) {
        this.nbLogger = nbLogger;
    }

    @Override
    public void debug(String tag, String message) {
        Objects.requireNonNull(nbLogger);
        nbLogger.d(1, message);
    }
}
