package kubeila.employee.durid;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者：@author zym
 * 创建时间：2019/9/1014:07
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
@Configuration
@EnableTransactionManagement
@AutoConfigureAfter({DruidConfig.class})
@MapperScan(basePackages = {"kubeila.employee.dao.mapper"})
public class TransactionConfig implements TransactionManagementConfigurer {
    @Autowired
    private DruidDataSource mDataSource;

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(mDataSource);
    }
}
