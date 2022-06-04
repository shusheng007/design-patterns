package top.ss007.observer;

/**
 * Created by shusheng007
 *
 * @author benwang
 * @date 2022/6/4 7:19 下午
 * @description:
 */
public class YinDangObserver implements TianDogObserver{

    @Override
    public void update(String message) {
        if("肚子好饿".equals(message)){
            System.out.println("西门：是吗？那我下面给你吃啊？上官：讨厌拉...");
        }else if("心情不好".equals(message)){
            System.out.println("西门：南门那边新开了一家酒吧，晚上带你去放松一下吧... 上官：好嗨吆，感觉人生达到了高峰..");
        }else {
            System.out.println("甜言蜜语...");
        }
    }
}
