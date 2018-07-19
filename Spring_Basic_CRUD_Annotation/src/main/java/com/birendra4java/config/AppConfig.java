package com.birendra4java.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@ComponentScan("com.birendra4java")
@Configuration
@PropertySource("classpath:db.properties")
public class AppConfig {
	//reading db properties
	@Value("${datasource.driver}")
	private String driver;
	@Value("${datasource.url}")
	private String url;
	@Value("${datasource.username}")
	private String username;
	@Value("${datasource.password}")
	private String password;

	@Bean
	public static PropertySourcesPlaceholderConfigurer configurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public JdbcTemplate createTemplate() {
		return new JdbcTemplate(createDataSource());
	}

	@Bean
	public DataSource createDataSource() {
		System.out.println("driver:" + driver);
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName(driver);
		source.setUrl(url);
		source.setUsername(username);
		source.setPassword(password);
		return source;
	}
}
