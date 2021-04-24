package top.ss007;

import top.ss007.chainofresponsibility.DogWang2Cor;
import top.ss007.command.DogWang2Client;

public class Main {

    public static void main(String[] args) {


        runChainOfResponsibility();
    }

    // 命令模式
    private static void runBuilder() {
        DogWang2Client dogWang2 = new DogWang2Client();
        dogWang2.enjoySexRobot();
    }

    //责任连模式
    private static void runChainOfResponsibility() {
        DogWang2Cor dogWang2Cor = new DogWang2Cor();
        dogWang2Cor.applyBudget();
    }

}
