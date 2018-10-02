package com.hben.bookstoreService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.hben.bookstoreService.interSeptor.UserInterseptor;

@Configuration
public class AppConfigurer extends WebMvcConfigurerAdapter {
	@Bean
	public HandlerInterceptor getMyInterceptor() {
		return new UserInterseptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(getMyInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}
}
