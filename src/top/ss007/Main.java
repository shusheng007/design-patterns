package top.ss007;

import top.ss007.run.DesignPatternName;
import top.ss007.run.PatternExecutor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("请输入列表中任意设计模式名称，列表：%s", DesignPatternName.patterList()));
        System.out.println("输入exit后按回车健可退出程序");
        PatternExecutor executor = new PatternExecutor();
        while (true) {
            final String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }
            try {
                executor.run(input);
            } catch (IllegalArgumentException e) {
                System.out.println("输入错误，请重试。或者输入exit回车退出程序");
            }
        }
    }
}
