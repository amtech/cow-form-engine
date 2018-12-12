package org.ljk.zodiac.cow.form.engine.beans;


import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfigration {

    @Value("${datasource.url}")
    private String url;

    @Value("${datasource.username}")
    private String username;

    @Value("${datasource.password}")
    private String password;

    @Value("${datasource.driver-class-name}")
    private String driverClassName;

    @Bean
    public DataSource dataSource() {

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);

        dataSource.setTestOnBorrow(true);
        dataSource.setValidationQuery("select 1");

        dataSource.setMinIdle(1);
        dataSource.setMaxActive(20);
        dataSource.setInitialSize(1);
        try {
            dataSource.init();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() {

        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        try {
            sessionFactory.setDataSource(dataSource());
            sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                    .getResources("classpath:/mybatis-mapper/**/*.xml"));
            return sessionFactory.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


    }
}
