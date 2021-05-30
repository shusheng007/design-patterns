package top.ss007.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/30 13:10
 * @description
 */
public class GameCareTaker {

    private List<GameProgressMemento> memento= new ArrayList<>();

    public void saveMemento(GameProgressMemento memento) {
        this.memento.add(memento);
    }

    public GameProgressMemento getMemento(int index) {
        return this.memento.get(index);
    }
}
