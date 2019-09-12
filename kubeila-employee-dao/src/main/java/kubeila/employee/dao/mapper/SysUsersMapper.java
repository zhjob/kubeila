package kubeila.employee.dao.mapper;

import java.util.List;
import kubeila.employee.entity.SysUsers;
import kubeila.employee.entity.SysUsersExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUsersMapper {
    /**
     *
     * @mbggenerated 2019-09-12
     */
    int countByExample(SysUsersExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int deleteByExample(SysUsersExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int deleteByPrimaryKey(Object id);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int insert(SysUsers record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int insertSelective(SysUsers record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    List<SysUsers> selectByExample(SysUsersExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    SysUsers selectByPrimaryKey(Object id);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByExampleSelective(@Param("record") SysUsers record, @Param("example") SysUsersExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByExample(@Param("record") SysUsers record, @Param("example") SysUsersExample example);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByPrimaryKeySelective(SysUsers record);

    /**
     *
     * @mbggenerated 2019-09-12
     */
    int updateByPrimaryKey(SysUsers record);
}