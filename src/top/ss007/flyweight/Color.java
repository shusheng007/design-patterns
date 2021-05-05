package top.ss007.flyweight;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/5 11:48
 * @description
 */
public enum Color {
    BLACK("黑色"),WHITE("白色");

    private String alias;

    Color(String alias) {
        this.alias= alias;
    }

    public String getAlias() {
        return alias;
    }
}
