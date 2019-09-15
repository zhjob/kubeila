package kubeila.employee.service;

import kubeila.employee.dao.mapper.SysUsersMapper;
import kubeila.employee.entity.SysUsers;
import kubeila.employee.entity.SysUsersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者：@author zym
 * 创建时间：2019/9/1215:50
 * 创建描述：
 *
 * 修 改 者：  
 * 修改时间： 
 * 修改描述： 
 *
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */
@Service
public class SysUsersService {

    @Autowired
    private SysUsersMapper sysUsersMapper;

    public List<SysUsers> selectByExample(SysUsersExample sysUsers){
        return  sysUsersMapper.selectByExample(sysUsers);
    }
}
