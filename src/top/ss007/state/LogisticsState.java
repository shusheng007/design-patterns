package top.ss007.state;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/3 10:40
 * @description 用于封装不同状态下的不同行为
 */
public interface LogisticsState {
    void doAction(JdLogistics context);
}
