package com.eatchu.web.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.eatchu.web.dao.mybatis")
public class ServiceContextConfig {
	
	
	@Bean
	public DriverManagerDataSource DataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://211.238.142.37:3306/eatchudb");
		dataSource.setUsername("eatchu");
		dataSource.setPassword("soakfaktwlq91");
		
		return dataSource;
	}
	
/*	@Bean
	public SqlSessionFactory sqlSessionFactory(DriverManagerDataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		
		sqlSessionFactory.setDataSource(dataSource);
		sqlSessionFactory.setMapperLocations(
				new PathMatchingResourcePatternResolver()
				.getResources("classpath:com/eatchu/web/dao/mybatis/mapper/*.xml")
				);
		
		return sqlSessionFactory.getObject();
		
	}
	
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		
		return new SqlSessionTemplate(sqlSessionFactory);
		
	}*/
	
}
