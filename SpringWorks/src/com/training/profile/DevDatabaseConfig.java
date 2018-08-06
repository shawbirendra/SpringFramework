package com.training.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Profile("Development")
@Configuration
public class DevDatabaseConfig implements DataBaseConfig {

	@Override
	@Bean(name="dev")
	public DataSource createDataSource() {
		System.out.println("DevDatabaseConfig.createDataSource()");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		return dataSource;
	}

}
