package kubeila.employee.dao.mapper;

import java.util.List;
import kubeila.employee.entity.SysRoles;
import kubeila.employee.entity.SysRolesExample;
import org.apache.ibatis.annotations.Param;

public interface SysRolesMapper {
    /**
     *
     * @mbggenerated 2019-09-12
     */
    int countByExample(SysRolesExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int deleteByExample(SysRolesExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int deleteByPrimaryKey(Object id);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int insert(SysRoles record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int insertSelective(SysRoles record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    List<SysRoles> selectByExample(SysRolesExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    SysRoles selectByPrimaryKey(Object id);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByExampleSelective(@Param("record") SysRoles record, @Param("example") SysRolesExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByExample(@Param("record") SysRoles record, @Param("example") SysRolesExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByPrimaryKeySelective(SysRoles record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByPrimaryKey(SysRoles record);
}