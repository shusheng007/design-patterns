package top.ss007.observer;

/**
 * Created by shusheng007
 *
 * @author benwang
 * @date 2022/6/4 7:04 下午
 * @description:
 */
public interface GreenTeaBitchSubject {
    void add(TianDogObserver observer);

    void remove(TianDogObserver observer);

    void notifyState(String state);
}
