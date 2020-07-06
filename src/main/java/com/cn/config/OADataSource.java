package com.cn.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
public class OADataSource {


    @Value("${spring.datasource.url}")
    private String dbUrl;
    /**
     *
     */
    @Value("${spring.datasource.username}")
    private String username;
    /**
     *
     */
    @Value("${spring.datasource.password}")
    private String password;
    /**
     *
     */
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    /**
     * @name 向SessionFactory注入数据源
     * @description 向SessionFactory注入数据源
     * @time 创建时间:2018年12月16日上午9:51:19
     * @param dataSource dataSource
     * @return SqlSessionFactory
     */
    @Bean(name = "oaSqlSessionFactory")
    public SqlSessionFactory oaSqlSessionFactory(DruidDataSource dataSource) throws Exception {
        final SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        dataSource.setUsername(dataSource.getUsername());
        dataSource.setPassword(dataSource.getPassword());
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapping/**/*.xml"));
        final org.apache.ibatis.session.Configuration ibatisConfiguration = new org.apache.ibatis.session.Configuration();
        ibatisConfiguration.setMapUnderscoreToCamelCase(true);
        bean.setConfiguration(ibatisConfiguration);
        return bean.getObject();
    }

    /**
     * @name 配置声明事务管理器
     * @description 配置声明事务管理器
     * @time 创建时间:2018年12月16日上午9:53:17
     * @param dataSource dataSource
     */
    @Bean(name = "oaTransactionManager")
    public PlatformTransactionManager oaTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * @name 创建SqlSessionTemplate(MyBatis-Spring的核心)
     * @description 创建SqlSessionTemplate(MyBatis-Spring的核心)
     * @time 创建时间:2018年12月16日上午9:54:13
     * @param sqlSessionFactory sqlSessionFactory
     * @return SqlSessionTemplate
     */
    @Bean(name = "oaSqlSessionTemplate")
    public SqlSessionTemplate oaSqlSessionTemplate(@Qualifier("oaSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    public DruidDataSource primaryDataSource() {
        final DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(dbUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);
        return datasource;
    }

}
