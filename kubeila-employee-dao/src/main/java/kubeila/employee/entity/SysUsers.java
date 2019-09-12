package kubeila.employee.entity;

public class SysUsers {
    /**
     * 编号
     */
    private Object id;

    /**
     * 用户名
     */
    private Object username;

    /**
     * 密码
     */
    private Object password;

    /**
     * 盐值
     */
    private Object salt;

    /**
     * 角色列表
     */
    private Object roleId;

    /**
     * 是否锁定
     */
    private Object locked;

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
     * 用户名
     * @return username 用户名
     */
    public Object getUsername() {
        return username;
    }

    /**
     * 用户名
     * @param username 用户名
     */
    public void setUsername(Object username) {
        this.username = username;
    }

    /**
     * 密码
     * @return password 密码
     */
    public Object getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(Object password) {
        this.password = password;
    }

    /**
     * 盐值
     * @return salt 盐值
     */
    public Object getSalt() {
        return salt;
    }

    /**
     * 盐值
     * @param salt 盐值
     */
    public void setSalt(Object salt) {
        this.salt = salt;
    }

    /**
     * 角色列表
     * @return role_id 角色列表
     */
    public Object getRoleId() {
        return roleId;
    }

    /**
     * 角色列表
     * @param roleId 角色列表
     */
    public void setRoleId(Object roleId) {
        this.roleId = roleId;
    }

    /**
     * 是否锁定
     * @return locked 是否锁定
     */
    public Object getLocked() {
        return locked;
    }

    /**
     * 是否锁定
     * @param locked 是否锁定
     */
    public void setLocked(Object locked) {
        this.locked = locked;
    }
}