package kubeila.employee.dao.mapper;

import java.util.List;
import kubeila.employee.entity.SysRolesPermissions;
import kubeila.employee.entity.SysRolesPermissionsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRolesPermissionsMapper {
    /**
     *
     * @mbggenerated 2019-09-12
     */
    int countByExample(SysRolesPermissionsExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int deleteByExample(SysRolesPermissionsExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int deleteByPrimaryKey(Object id);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int insert(SysRolesPermissions record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int insertSelective(SysRolesPermissions record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    List<SysRolesPermissions> selectByExample(SysRolesPermissionsExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    SysRolesPermissions selectByPrimaryKey(Object id);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByExampleSelective(@Param("record") SysRolesPermissions record, @Param("example") SysRolesPermissionsExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByExample(@Param("record") SysRolesPermissions record, @Param("example") SysRolesPermissionsExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByPrimaryKeySelective(SysRolesPermissions record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByPrimaryKey(SysRolesPermissions record);
}