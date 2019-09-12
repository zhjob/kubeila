package kubeila.employee.dao.mapper;

import java.util.List;
import kubeila.employee.entity.SysPermissions;
import kubeila.employee.entity.SysPermissionsExample;
import org.apache.ibatis.annotations.Param;

public interface SysPermissionsMapper {
    /**
     *
     * @mbggenerated 2019-09-12
     */
    int countByExample(SysPermissionsExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int deleteByExample(SysPermissionsExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int deleteByPrimaryKey(Object id);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int insert(SysPermissions record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int insertSelective(SysPermissions record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    List<SysPermissions> selectByExample(SysPermissionsExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    SysPermissions selectByPrimaryKey(Object id);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByExampleSelective(@Param("record") SysPermissions record, @Param("example") SysPermissionsExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByExample(@Param("record") SysPermissions record, @Param("example") SysPermissionsExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByPrimaryKeySelective(SysPermissions record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByPrimaryKey(SysPermissions record);
}