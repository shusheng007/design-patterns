package top.ss007.visitor;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/6/7 22:04
 * @description
 */
public class LiveApp implements CorporateSlaveVisitor {
    @Override
    public void visit(Programmer programmer) {
        System.out.println(String.format("%s: 最近小视频很火啊，咱能不能抄袭下抖音，搞他一炮,将来公司上市了，你的身价至少也是几千万，甚至上亿...",programmer.getName()));
    }

    @Override
    public void visit(HumanSource humanSource) {
        System.out.println(String.format("%s: 咱公司就数你长得靓，哪天化化妆，把你的事业线适当露一露，要是火了你在北京买房都不是梦...",humanSource.getName()));
    }

    @Override
    public void visit(Tester tester) {
        System.out.println(String.format("%s: 你也开个账户，边测试边直播，两不耽误...",tester.getName()));
    }
}
