package top.ss007.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shusheng007
 *
 * @author benwang
 * @date 2022/6/4 7:09 下午
 * @description:
 */
public class ShangGuanSubject implements GreenTeaBitchSubject{
    private List<TianDogObserver> tianDogs = new ArrayList<>();

    @Override
    public void add(TianDogObserver observer) {
        tianDogs.add(observer);
    }

    @Override
    public void remove(TianDogObserver observer) {
        tianDogs.remove(observer);
    }

    @Override
    public void notifyState(String state) {
        for (TianDogObserver tianDog : tianDogs) {
            tianDog.update(state);
        }
    }
}
