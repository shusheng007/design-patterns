package top.ss007.memento;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/30 13:10
 * @description
 */
public class GameOriginator {
    private int currentScore;

    public GameProgressMemento saveProcess() {
        return new GameProgressMemento(currentScore);
    }

    public void restoreProcess(GameProgressMemento memento) {
        currentScore = memento.getScore();
    }

    //对内部状态的使用
    public void playGame() {
        System.out.println("------------------开始游戏------------------");
        System.out.println("当前分数为："+ currentScore);
        System.out.println("杀死一个小怪物得1分");
        currentScore++;
        System.out.println(String.format("总分为：%d", currentScore));
    }

    public void exitGame(){
        System.out.println("退出游戏");
        currentScore=0;
        System.out.println("-----------------退出游戏-------------------");
    }

}
