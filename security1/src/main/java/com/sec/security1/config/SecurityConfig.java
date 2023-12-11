package com.sec.security1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // 스프링 시큐리티 필터가 스프링 필터체인에 등록이 된다.
public class SecurityConfig  {
	
	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
		
		http.csrf((csrfConfig) -> csrfConfig.disable())
		.headers((headerConfig) -> headerConfig.frameOptions((frameOptionsConfig) -> frameOptionsConfig.disable())
		.AuthorizeHttpRequestsConfigurer<HttpSecurityBuilder<H>>(requests -> requests
                .requestMatchers("/login/**").permitAll()
                .requestMatchers("/user/**").authenticated()
                .requestMatchers("/manager/**").hasRole(Role.MANAGER.name() | Role.ADMIN.name())
                .requestMatchers("/admin/**").hasRole(Role.MANAGER.name())
                .anyRequest().authenticated();
		
		return http.build();
	}

}
