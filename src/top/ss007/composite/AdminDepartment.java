package top.ss007.composite;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/3 15:09
 * @description
 */
public class AdminDepartment extends OrganizationComponent {

    public AdminDepartment(String name) {
        super(name);
    }

    @Override
    public int getStaffCount() {
        return 50;
    }
}
