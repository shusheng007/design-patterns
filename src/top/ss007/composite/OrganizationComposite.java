package top.ss007.composite;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/3 15:10
 * @description
 */
public class OrganizationComposite extends OrganizationComponent {

    public OrganizationComposite(String name) {
        super(name);
    }

    @Override
    public int getStaffCount() {
        int count = 0;
        for (OrganizationComponent organization : organizations) {
            count += organization.getStaffCount();
        }
        return count;
    }

}
