package com.eatchu.web.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@ComponentScan(basePackages="com.eatchu.web.config")
@EnableWebSecurity
public class SecurityContextConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private DataSource dataSource;
	@Autowired
	private AuthenticationSuccessHandler successHandler;
	
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
				.defaultSuccessUrl("/index")
				.loginPage("/customer/login")
				.loginProcessingUrl("/login")
				.successHandler(successHandler)
				.and()
			.logout()
				.logoutUrl("/member/logout")
				.logoutSuccessUrl("/index");
		
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
		
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			//1. 내가 쿼리를 만들어서 제곤
			//2. 약속된 인터페이스로 구현된 사용자정보 제공 객체
			.usersByUsernameQuery("select id, pwd password, 1 enabled from Member where id=?")
			.authoritiesByUsernameQuery("select memberId id, roleName authority from MemberRole where memberId=?")
			.passwordEncoder(new BCryptPasswordEncoder());
		
	}
}
