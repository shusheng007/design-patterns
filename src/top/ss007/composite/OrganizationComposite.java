package top.ss007.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/3 15:10
 * @description
 */
public class OrganizationComposite extends OrganizationComponent {

    //很关键，这体现了组合的思想
    private List<OrganizationComponent> organizations = new ArrayList<>();

    public OrganizationComposite(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent organization) {
        organizations.add(organization);
    }

    @Override
    public OrganizationComponent getChild(String orgName) {
        for (OrganizationComponent org : organizations) {
            OrganizationComponent targetOrg = org.getChild(orgName);
            if (targetOrg != null) {
                return targetOrg;
            }
        }
        return null;
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
