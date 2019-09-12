package kubeila.employee.entity;

public class SysRolesPermissions {
    /**
     * 编号
     */
    private Object id;

    /**
     * 角色编号
     */
    private Object roleId;

    /**
     * 权限编号
     */
    private Object permissionId;

    /**
     * 编号
     * @return id 编号
     */
    public Object getId() {
        return id;
    }

    /**
     * 编号
     * @param id 编号
     */
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * 角色编号
     * @return role_id 角色编号
     */
    public Object getRoleId() {
        return roleId;
    }

    /**
     * 角色编号
     * @param roleId 角色编号
     */
    public void setRoleId(Object roleId) {
        this.roleId = roleId;
    }

    /**
     * 权限编号
     * @return permission_id 权限编号
     */
    public Object getPermissionId() {
        return permissionId;
    }

    /**
     * 权限编号
     * @param permissionId 权限编号
     */
    public void setPermissionId(Object permissionId) {
        this.permissionId = permissionId;
    }
}