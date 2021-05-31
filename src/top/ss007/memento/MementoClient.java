package top.ss007.memento;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/30 13:26
 * @description
 */
public class MementoClient {

    public void replayGame() {
        GameOriginator originator = new GameOriginator();
        GameCareTaker careTaker = new GameCareTaker();
        //玩游戏
        originator.playGame();
        //保存进度
        careTaker.saveMemento(originator.saveProcess());
        //退出游戏
        originator.exitGame();

        //重新打开游戏，恢复进度
        originator.restoreProcess(careTaker.getMemento(0));
        originator.playGame();
    }
}
