package top.ss007.template;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/1 23:35
 * @description
 */
public class TencentLivePlay extends LivePlay  {
    @Override
    public void openRoom() {
        System.out.println("腾讯打开房间");
    }

    @Override
    public void startAudioAndVideoStream() {
        System.out.println("腾讯打开音视频流");
    }

    @Override
    public void stopAudioAndVideoStream() {
        System.out.println("腾讯关闭音视频流");
    }

    @Override
    public void closeRoom() {
        System.out.println("腾讯关闭房间");
    }
    //覆写钩子方法，提供旁路推流功能
    @Override
    public void pushVideoStream() {
        super.pushVideoStream();
        System.out.println("腾讯进行旁路推流");
    }
}

