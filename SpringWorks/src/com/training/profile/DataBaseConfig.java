package com.training.profile;

import javax.sql.DataSource;

public interface DataBaseConfig {
	public DataSource createDataSource();
}
