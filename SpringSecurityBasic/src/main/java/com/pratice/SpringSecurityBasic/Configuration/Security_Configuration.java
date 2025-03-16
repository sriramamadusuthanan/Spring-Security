package com.pratice.SpringSecurityBasic.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class Security_Configuration {
	
	@Bean
	public SecurityFilterChain securityfilterchain (HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests(auth->auth.requestMatchers("/","/home").permitAll()  //this make the end point public 
				.anyRequest().authenticated()// this makes the end point secure 
				).formLogin(withDefaults()).httpBasic(withDefaults());		 
	return http.build();
	}
}
