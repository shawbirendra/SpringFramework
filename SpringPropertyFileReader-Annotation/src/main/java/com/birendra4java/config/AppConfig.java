package com.birendra4java.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:/com/birendra4java/resources/employee_info.properties")
@ComponentScan("com.birendra4java.beans")
public class AppConfig {

	/*
	 * Use PropertySourcesPlaceholderConfigurer instead of
	 * PropertyPlaceholderConfigurer for spring version 4 & above
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
