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

    @Override
    public void add(OrganizationComponent organization) {
        throw new UnsupportedOperationException(this.getName()+"已经是最基本部门，无法增加下属部门");
    }

    @Override
    public OrganizationComponent getChild(String orgName) {
        if(getName().equals(orgName)){
            return this;
        }
        return null;
    }
}
