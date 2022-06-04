package top.ss007.observer;

/**
 * Created by shusheng007
 *
 * @author benwang
 * @date 2022/6/4 5:52 下午
 * @description:
 */
public class ObserverClient {
    public void sendThink(){
        GreenTeaBitchSubject subject = new ShangGuanSubject();
        Dog2WangObserver dog2WangObserver = new Dog2WangObserver();
        subject.add(dog2WangObserver);
        subject.add(new YinDangObserver());
        System.out.println("------午夜12点，肚子好饿，找个人来买东西吃------");
        subject.notifyState("肚子好饿");
        System.out.println("------又被渣男甩了，有点小难过，找个人来安慰一下------");
        subject.notifyState("心情不好");

        System.out.println("------二狗终于看透了上官这个绿茶婊，和牛翠花走到了一起------");
        subject.remove(dog2WangObserver);

        System.out.println("------上官又被渣男甩了，想找个人来安慰一下，却不见了那个好人的身影------");
        subject.notifyState("心情不好");

    }
}
