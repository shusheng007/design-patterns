package top.ss007.template;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/1 23:34
 * @description
 */
public abstract class LivePlay {
    //模板方法
    public final void seeLivePlay() {
        login();
        openRoom();
        startAudioAndVideoStream();
        pushVideoStream();
        stopAudioAndVideoStream();
        closeRoom();
    }

    //实体方法，这个方法实现通用的业务逻辑
    private void login() {
        System.out.println("用户登录");
    }

    /*抽象方法*/
    //打开房间
    public abstract void openRoom();
    //打开音视频流
    public abstract void startAudioAndVideoStream();
    //关闭音视频流
    public abstract void stopAudioAndVideoStream();
    //关闭房间
    public abstract void closeRoom();

    /*钩子方法，可以被需要的子类overwrite*/
    //旁路推流，可以通过视频链接在浏览器中查看视频
    public void pushVideoStream() {
    }
}
