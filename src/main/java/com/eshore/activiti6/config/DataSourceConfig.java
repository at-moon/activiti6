package com.eshore.activiti6.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.hibernate.ejb.HibernatePersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@ComponentScan
@Configuration
//@EnableJpaRepositories({ "org.activiti.app.repository" })
//@EnableTransactionManagement
public class DataSourceConfig {

    @Autowired
    private Environment environment;

    @Bean
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(environment.getProperty("spring.datasource.url"));
        dataSource.setUsername(environment.getProperty("spring.datasource.username"));
        dataSource.setPassword(environment.getProperty("spring.datasource.password"));
        dataSource.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
        return dataSource;
    }


    @Bean(name = "entityManagerFactory")
    public EntityManagerFactory entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
        lcemfb.setPersistenceProvider(new HibernatePersistence());
        lcemfb.setPersistenceUnitName("persistenceUnit");
        lcemfb.setDataSource(getDataSource());
        lcemfb.setJpaDialect(new HibernateJpaDialect());
        lcemfb.setJpaVendorAdapter(jpaVendorAdapter());

        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.cache.use_second_level_cache", false);
        jpaProperties.put("hibernate.generate_statistics", environment.getProperty("hibernate.generate_statistics", Boolean.class, false));
        lcemfb.setJpaProperties(jpaProperties);

        lcemfb.setPackagesToScan("org.activiti.app.domain");
        lcemfb.afterPropertiesSet();
        return lcemfb.getObject();
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setShowSql(environment.getProperty("hibernate.show_sql", Boolean.class, false));
        jpaVendorAdapter.setDatabasePlatform(environment.getProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect"));
        return jpaVendorAdapter;
    }
}
