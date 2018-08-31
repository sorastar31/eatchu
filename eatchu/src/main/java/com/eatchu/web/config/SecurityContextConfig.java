package com.eatchu.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityContextConfig extends WebSecurityConfigurerAdapter{
	
	
	@Autowired
	private DriverManagerDataSource dataSource;	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests()
/*			.antMatchers("//**").hasRole("ADMIN")*/			
			.antMatchers("/member/**").hasAnyRole("ADMIN, MEMBER")
			.anyRequest().permitAll()
			.and()
			.formLogin()
				.loginPage("/customer/login")
				.loginProcessingUrl("/customer/login");
		
			/*.authorizeRequests()
			.antMatchers("/student/**").hasAnyRole("ADMIN, STUDENT")
			.antMatchers("/teacher/**").hasAnyRole("ADMIN, TEACHER")
			.antMatchers("/academy/**").hasAnyRole("ADMIN, ACADEMY")
			.antMatchers("/admin/**").hasRole("ADMIN");*/
		
	}
	
	 
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		/*
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			//1. 내가 쿼리를 만들어서 제곤
			//2. 약속된 인터페이스로 구현된 사용자정보 제공 객체
			.usersByUsernameQuery("select id, pwd password, 1 enabled from Member where id=?")
			.authoritiesByUsernameQuery("select memberId id, roleName authority from MemberRole where memberId=?")
			.passwordEncoder(new BCryptPasswordEncoder());*/
			
		
		
		UserBuilder users = User.builder();
		auth.inMemoryAuthentication()
		.withUser(users
				.username("nayo")
				.password("$2a$10$zpE1ThBwaRlZM2uMMShksurhrRjw/QtUZXB4cfON4.owLTFqkyQx.")
				.roles("MEMBER"))
		.withUser(users
				.username("woghks2045")
				.password("$2a$10$zpE1ThBwaRlZM2uMMShksurhrRjw/QtUZXB4cfON4.owLTFqkyQx.")
				.roles("MEMBER"))
		.withUser(users
				.username("sora")
				.password("$2a$10$zpE1ThBwaRlZM2uMMShksurhrRjw/QtUZXB4cfON4.owLTFqkyQx.")
				.roles("MEMBER"));;
	}
}
