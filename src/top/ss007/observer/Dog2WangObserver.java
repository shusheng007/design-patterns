package top.ss007.observer;

/**
 * Created by shusheng007
 *
 * @author benwang
 * @date 2022/6/4 7:12 下午
 * @description:
 */
public class Dog2WangObserver implements TianDogObserver{
    @Override
    public void update(String message) {
        if("肚子好饿".equals(message)){
            System.out.println("二狗：半夜起来，翻墙出去步行2公里买女神最爱吃的小笼包... 上官：二狗，你真是个好人");
        }else if("心情不好".equals(message)){
            System.out.println("二狗：官哭着述说渣男怎么欺负的她...整整3个小时，全程安慰... 上官：二狗，你真是个好人");
        }else {
            System.out.println("随叫随到...");
        }
    }
}
