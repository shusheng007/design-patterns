package top.ss007.template;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/1 23:36
 * @description
 *
 * 由于金山SDK没有提供了旁路推流的功能，所以它不用覆写pushVideoStream()这个钩子方法,而只需要overwrite抽象方法即可
 */
public class JinShanLivePlay extends LivePlay  {
    @Override
    public void openRoom() {
        System.out.println("金山打开房间");
    }

    @Override
    public void startAudioAndVideoStream() {
        System.out.println("金山打开音视频流");
    }

    @Override
    public void stopAudioAndVideoStream() {
        System.out.println("金山关闭音视频流");
    }

    @Override
    public void closeRoom() {
        System.out.println("金山关闭房间");
    }
}

