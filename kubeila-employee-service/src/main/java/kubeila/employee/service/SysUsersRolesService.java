package kubeila.employee.service;

import kubeila.employee.dao.mapper.SysUsersRolesMapper;
import kubeila.employee.entity.SysUsersRoles;
import kubeila.employee.entity.SysUsersRolesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUsersRolesService {

    @Autowired
    private SysUsersRolesMapper sysUsersRolesMapper;


    public List<SysUsersRoles> selectByExample(SysUsersRolesExample sysUsersRolesExample){
        return sysUsersRolesMapper.selectByExample(sysUsersRolesExample);
    }

    public List<SysUsersRoles> selectUserstoRole(SysUsersRoles sysUsersRoles){
        return sysUsersRolesMapper.selectUserstoRole(sysUsersRoles);
    }
}
