package kubeila.employee.entity;

public class SysPermissions {
    /**
     * 编号
     */
    private Object id;

    /**
     * 权限编号
     */
    private Object permission;

    /**
     * 权限描述
     */
    private Object description;

    /**
     * 此权限关联角色的id
     */
    private Object rid;

    /**
     * 是否锁定
     */
    private Object available;

    /**
     * 
     */
    private Object parentid;

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
     * 权限编号
     * @return permission 权限编号
     */
    public Object getPermission() {
        return permission;
    }

    /**
     * 权限编号
     * @param permission 权限编号
     */
    public void setPermission(Object permission) {
        this.permission = permission;
    }

    /**
     * 权限描述
     * @return description 权限描述
     */
    public Object getDescription() {
        return description;
    }

    /**
     * 权限描述
     * @param description 权限描述
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    /**
     * 此权限关联角色的id
     * @return rid 此权限关联角色的id
     */
    public Object getRid() {
        return rid;
    }

    /**
     * 此权限关联角色的id
     * @param rid 此权限关联角色的id
     */
    public void setRid(Object rid) {
        this.rid = rid;
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

    /**
     * 
     * @return parentid 
     */
    public Object getParentid() {
        return parentid;
    }

    /**
     * 
     * @param parentid 
     */
    public void setParentid(Object parentid) {
        this.parentid = parentid;
    }
}