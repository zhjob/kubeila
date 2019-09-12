package kubeila.employee.entity;

public class SysRoles {
    /**
     * 角色编号
     */
    private Object id;

    /**
     * 角色名称
     */
    private Object rolename;

    /**
     * 角色描述
     */
    private Object description;

    /**
     * 父节点
     */
    private Object pid;

    /**
     * 是否锁定
     */
    private Object available;

    /**
     * 角色编号
     * @return id 角色编号
     */
    public Object getId() {
        return id;
    }

    /**
     * 角色编号
     * @param id 角色编号
     */
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * 角色名称
     * @return rolename 角色名称
     */
    public Object getRolename() {
        return rolename;
    }

    /**
     * 角色名称
     * @param rolename 角色名称
     */
    public void setRolename(Object rolename) {
        this.rolename = rolename;
    }

    /**
     * 角色描述
     * @return description 角色描述
     */
    public Object getDescription() {
        return description;
    }

    /**
     * 角色描述
     * @param description 角色描述
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    /**
     * 父节点
     * @return pid 父节点
     */
    public Object getPid() {
        return pid;
    }

    /**
     * 父节点
     * @param pid 父节点
     */
    public void setPid(Object pid) {
        this.pid = pid;
    }

    /**
     * 是否锁定
     * @return available 是否锁定
     */
    public Object getAvailable() {
        return available;
    }

    /**
     * 是否锁定
     * @param available 是否锁定
     */
    public void setAvailable(Object available) {
        this.available = available;
    }
}