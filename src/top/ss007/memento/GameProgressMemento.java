package top.ss007.memento;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/30 13:08
 * @description
 */
public class GameProgressMemento {
    private int score;

    public GameProgressMemento(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
