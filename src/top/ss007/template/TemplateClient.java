package top.ss007.template;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/1 23:38
 * @description
 */
public class TemplateClient {

    public void startLivePlay() {
        LivePlay tencentLive = new TencentLivePlay();
        tencentLive.seeLivePlay();

        System.out.println("-----------切换视频流服务商-------------");

        LivePlay jinShanLive = new JinShanLivePlay();
        jinShanLive.seeLivePlay();
    }
}
