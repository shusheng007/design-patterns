package top.ss007.visitor;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/6/7 22:04
 * @description
 */
public class SocialApp implements CorporateSlaveVisitor {
    @Override
    public void visit(Programmer programmer) {
        System.out.println(String.format("%s: 给你一个月，先仿照微信搞个类似的APP出来,要能语音能发红包,将来公司上市了少不了你的，好好干...",programmer.getName()));
    }

    @Override
    public void visit(HumanSource humanSource) {
        System.out.println(String.format("%s: 咱现在缺人，你暂时就充当了陪聊吧，在程序员开发APP期间，你去发发软文，积攒点粉丝...",humanSource.getName()));
    }

    @Override
    public void visit(Tester tester) {
        System.out.println(String.format("%s: 这是咱创业的第一炮，一定要打响，测试不能掉链子啊，不能让APP带伤上战场，以后给你多招点人，你就是领导了...",tester.getName()));
    }
}
