package top.ss007.facade;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/5 23:18
 * @description
 */
public class FacadeClient {
    public void printReport(){
        new ReportFacade().generateReport();
    }
}
