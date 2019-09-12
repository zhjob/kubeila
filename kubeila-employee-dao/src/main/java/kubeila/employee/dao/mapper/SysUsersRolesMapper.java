package kubeila.employee.dao.mapper;

import java.util.List;
import kubeila.employee.entity.SysUsersRoles;
import kubeila.employee.entity.SysUsersRolesExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUsersRolesMapper {
    /**
     *
     * @mbggenerated 2019-09-12
     */
    int countByExample(SysUsersRolesExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int deleteByExample(SysUsersRolesExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int deleteByPrimaryKey(Object id);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int insert(SysUsersRoles record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int insertSelective(SysUsersRoles record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    List<SysUsersRoles> selectByExample(SysUsersRolesExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    SysUsersRoles selectByPrimaryKey(Object id);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByExampleSelective(@Param("record") SysUsersRoles record, @Param("example") SysUsersRolesExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByExample(@Param("record") SysUsersRoles record, @Param("example") SysUsersRolesExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByPrimaryKeySelective(SysUsersRoles record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByPrimaryKey(SysUsersRoles record);
}