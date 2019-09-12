package kubeila.employee.durid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者：@author zym
 * 创建时间：2019/9/1013:49
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
@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class DruidConfig {


    /**
     * 这个方法，就是告诉框架，数据源是由这个方法来提供，注解 @Primary 意思是告诉框架，如果开发者没有指定其他数据源，
     * 那么就默认调用这个方法来提供数据源。这一步进行完，其实 Druid 的最核心的配置已经进行完毕，可以使用 Druid 来给 Mybatis
     * 或者 JPA 提供数据库连接了
     * @return
     */

    @Bean(initMethod = "init", destroyMethod = "close")
    @Primary
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setInitialSize(initialSize);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxActive(maxActive);
        dataSource.setMaxWait(maxWait);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setValidationQuery(validationQuery);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        dataSource.setPoolPreparedStatements(poolPreparedStatements);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        dataSource.setRemoveAbandonedTimeoutMillis(removeAbandonedTimeoutMillis);
        dataSource.setRemoveAbandoned(removeAbandoned);
        dataSource.setLogDifferentThread(logDifferentThread);

        try {
            dataSource.setFilters(filters);
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        dataSource.setConnectionProperties(connectionProperties);
        dataSource.setUseGlobalDataSourceStat(useGlobalDataSourceStat);

        return dataSource;
    }

    /**
     * 配置 Druid 监控页面。Druid 提供了数据库链接状态和 SQL 执行的页面，方便开发者查看自己的程序的数据库连接与操作状态，这个监控后
     * 台的页面 Servlet 是 StatViewServlet，我们配置好他，就能打开监控后台查看数据了，在 DruidConfig 中，新增一个如下的方法
     * @return
     */
    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean servletBean = new ServletRegistrationBean(new StatViewServlet(), druidRegistrationUrl);
        servletBean.addInitParameter("resetEnable", String.valueOf(resetEnable));
        servletBean.addInitParameter("loginUsername", loginUsername);
        servletBean.addInitParameter("loginPassword", loginPassword);

        return servletBean;
    }

    /**
     * 还需要给监控后台加上一些过滤，避免一些没必要的资源和页面被统计进去，所以我们还要配置一个 WebStatFilter，关于 WebStatFilter
     * 的配置参数，请查阅相关文档，我这里只是部分配置参数。我们在 DruidConfig 中，新增一个如下的方法
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistration() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns(filtersUrlPatterns);
        filterRegistrationBean.addInitParameter("exclusions", exclusions);
        filterRegistrationBean.addInitParameter("sessionStatMaxCount", String.valueOf(sessionStatMaxCount));
        filterRegistrationBean.addInitParameter("sessionStatEnable", String.valueOf(sessionStatEnable));
        filterRegistrationBean.addInitParameter("principalSessionName", principalSessionName);
        filterRegistrationBean.addInitParameter("profileEnable", String.valueOf(profileEnable));

        return filterRegistrationBean;
    }



















    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private int initialSize;
    private int minIdle;
    private int maxActive;
    private long maxWait;
    private long timeBetweenEvictionRunsMillis;
    private long minEvictableIdleTimeMillis;
    private String validationQuery;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;
    private boolean poolPreparedStatements;
    private int maxPoolPreparedStatementPerConnectionSize;
    private long removeAbandonedTimeoutMillis;
    private boolean removeAbandoned;
    private boolean logAbandoned;
    private boolean logDifferentThread;
    private String filters;
    private String connectionProperties;
    private boolean useGlobalDataSourceStat;

    //Druid 监控 Servlet 配置参数
    private String druidRegistrationUrl;
    private boolean resetEnable;
    private String loginUsername;
    private String loginPassword;

    // Filters 配置参数
    private String filtersUrlPatterns;
    private String exclusions;
    private int sessionStatMaxCount;
    private boolean sessionStatEnable;
    private String principalSessionName;
    private boolean profileEnable;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public long getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(long maxWait) {
        this.maxWait = maxWait;
    }

    public long getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    public long getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public void setMinEvictableIdleTimeMillis(long minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public boolean isPoolPreparedStatements() {
        return poolPreparedStatements;
    }

    public void setPoolPreparedStatements(boolean poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }

    public int getMaxPoolPreparedStatementPerConnectionSize() {
        return maxPoolPreparedStatementPerConnectionSize;
    }

    public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
        this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
    }

    public long getRemoveAbandonedTimeoutMillis() {
        return removeAbandonedTimeoutMillis;
    }

    public void setRemoveAbandonedTimeoutMillis(long removeAbandonedTimeoutMillis) {
        this.removeAbandonedTimeoutMillis = removeAbandonedTimeoutMillis;
    }

    public boolean isRemoveAbandoned() {
        return removeAbandoned;
    }

    public void setRemoveAbandoned(boolean removeAbandoned) {
        this.removeAbandoned = removeAbandoned;
    }

    public boolean isLogAbandoned() {
        return logAbandoned;
    }

    public void setLogAbandoned(boolean logAbandoned) {
        this.logAbandoned = logAbandoned;
    }

    public boolean isLogDifferentThread() {
        return logDifferentThread;
    }

    public void setLogDifferentThread(boolean logDifferentThread) {
        this.logDifferentThread = logDifferentThread;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public String getConnectionProperties() {
        return connectionProperties;
    }

    public void setConnectionProperties(String connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

    public boolean isUseGlobalDataSourceStat() {
        return useGlobalDataSourceStat;
    }

    public void setUseGlobalDataSourceStat(boolean useGlobalDataSourceStat) {
        this.useGlobalDataSourceStat = useGlobalDataSourceStat;
    }

    public String getDruidRegistrationUrl() {
        return druidRegistrationUrl;
    }

    public void setDruidRegistrationUrl(String druidRegistrationUrl) {
        this.druidRegistrationUrl = druidRegistrationUrl;
    }

    public boolean isResetEnable() {
        return resetEnable;
    }

    public void setResetEnable(boolean resetEnable) {
        this.resetEnable = resetEnable;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getFiltersUrlPatterns() {
        return filtersUrlPatterns;
    }

    public void setFiltersUrlPatterns(String filtersUrlPatterns) {
        this.filtersUrlPatterns = filtersUrlPatterns;
    }

    public String getExclusions() {
        return exclusions;
    }

    public void setExclusions(String exclusions) {
        this.exclusions = exclusions;
    }

    public int getSessionStatMaxCount() {
        return sessionStatMaxCount;
    }

    public void setSessionStatMaxCount(int sessionStatMaxCount) {
        this.sessionStatMaxCount = sessionStatMaxCount;
    }

    public boolean isSessionStatEnable() {
        return sessionStatEnable;
    }

    public void setSessionStatEnable(boolean sessionStatEnable) {
        this.sessionStatEnable = sessionStatEnable;
    }

    public String getPrincipalSessionName() {
        return principalSessionName;
    }

    public void setPrincipalSessionName(String principalSessionName) {
        this.principalSessionName = principalSessionName;
    }

    public boolean isProfileEnable() {
        return profileEnable;
    }

    public void setProfileEnable(boolean profileEnable) {
        this.profileEnable = profileEnable;
    }
}
