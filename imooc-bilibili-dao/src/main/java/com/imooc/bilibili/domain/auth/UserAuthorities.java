package com.imooc.bilibili.domain.auth;

import java.util.List;

/**
 * 存放某一角色对应的所有权限
 */
public class UserAuthorities {

    //前端操作权限列表
    List<AuthRoleElementOperation> roleElementOperationList;
    //前端页面菜单权限列表
    List<AuthRoleMenu> roleMenuList;
    //...

    public List<AuthRoleElementOperation> getRoleElementOperationList() {
        return roleElementOperationList;
    }

    public void setRoleElementOperationList(List<AuthRoleElementOperation> roleElementOperationList) {
        this.roleElementOperationList = roleElementOperationList;
    }

    public List<AuthRoleMenu> getRoleMenuList() {
        return roleMenuList;
    }

    public void setRoleMenuList(List<AuthRoleMenu> roleMenuList) {
        this.roleMenuList = roleMenuList;
    }
}
