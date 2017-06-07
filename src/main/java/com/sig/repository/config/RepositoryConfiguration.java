package com.sig.repository.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration

@MapperScan(basePackages="com.sig.repository.mapper",sqlSessionFactoryRef="sqlSessionFactory1")
@PropertySource("classpath:persistence.properties")
public class RepositoryConfiguration {
	
	@Autowired
	private Environment env;
	
	@Bean
    public DataSource dataSource1() {
		 DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("database.jdbc.driver"));
        dataSource.setUsername(env.getProperty("database.jdbc.user"));
        dataSource.setUrl(env.getProperty("database.jdbc.url"));
        dataSource.setPassword(env.getProperty("database.jdbc.password"));
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource1());
    }
    
    @Bean(name="sqlSessionFactory1")
    public SqlSessionFactoryBean sqlSessionFactory1() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource1());
        sessionFactory.setTypeAliasesPackage("com.sig.domain");
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:com/sig/repository/mapper/*.xml"));
        return sessionFactory;
    }
    
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }

}




