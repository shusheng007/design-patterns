package top.ss007.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/3 15:07
 * @description
 */
public abstract class OrganizationComponent {
    private String name;

    //很关键，这提现了组合的思想
    protected List<OrganizationComponent> organizations = new ArrayList<>();

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(OrganizationComponent organization) {
        organizations.add(organization);
    }

    public OrganizationComponent getChild(String orgName){
        for (OrganizationComponent org : organizations) {
            OrganizationComponent targetOrg = org.getChild(orgName);
            if (targetOrg != null) {
                return targetOrg;
            }
        }
        return null;
    }

    public abstract int getStaffCount();

    @Override
    public String toString() {
        return name;
    }
}
