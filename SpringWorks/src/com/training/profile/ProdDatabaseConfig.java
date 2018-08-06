package com.training.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Profile("Production")
@Configuration
public class ProdDatabaseConfig implements DataBaseConfig{

	@Override
	@Bean(name="prod")
	public DataSource createDataSource() {
		System.out.println("ProdDatabaseConfig.createDataSource()");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		return dataSource;
	}

}
