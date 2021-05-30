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

        originator.playGame();
        careTaker.saveMemento(originator.saveProcess());
        originator.exitGame();

        originator.restoreProcess(careTaker.getMemento(0));
        originator.playGame();
    }
}
