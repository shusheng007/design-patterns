package top.ss007.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/6/7 23:01
 * @description
 */
public class BigHuYouCompany {
    private List<CorporateSlave> employee= new ArrayList<>();

    public BigHuYouCompany() {
        employee.add(new Programmer("王二狗"));
        employee.add(new HumanSource("上官无需"));
        employee.add(new Tester("牛翠花"));
    }

    public void startProject(CorporateSlaveVisitor visitor){
        for (CorporateSlave slave : employee) {
            slave.accept(visitor);
        }
    }
}
