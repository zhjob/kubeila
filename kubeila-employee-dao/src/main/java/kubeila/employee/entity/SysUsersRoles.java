package kubeila.employee.entity;

public class SysUsersRoles {
    /**
     * 编号
     */
    private Object id;

    /**
     * 用户编号
     */
    private Object userId;

    /**
     * 角色编号
     */
    private Object roleId;

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
     * 用户编号
     * @return user_id 用户编号
     */
    public Object getUserId() {
        return userId;
    }

    /**
     * 用户编号
     * @param userId 用户编号
     */
    public void setUserId(Object userId) {
        this.userId = userId;
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
}