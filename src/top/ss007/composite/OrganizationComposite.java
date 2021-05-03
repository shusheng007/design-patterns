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

    private List<OrganizationComponent> organizations = new ArrayList<>();

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

    public void addOrganization(OrganizationComponent organization) {
        organizations.add(organization);
    }

    /**
     * 通过组织名称获取组织
     * @param orgName
     * @return
     */
    public OrganizationComponent getOrganization(String orgName) {
        for (OrganizationComponent org : organizations) {
            if(org instanceof OrganizationComposite){
               return  ((OrganizationComposite) org).getOrganization(orgName);
            }
            if(org.getName().equals(orgName)){
                return org;
            }
        }
        return null;
    }
}
