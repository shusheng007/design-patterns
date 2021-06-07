package top.ss007.visitor;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/6/7 21:54
 * @description
 */
public interface CorporateSlaveVisitor {
    void visit(Programmer programmer);

    void visit(HumanSource humanSource);

    void visit(Tester tester);
}
