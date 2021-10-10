package ca.sheridancollege.BingChenSun.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class DatabaseConfiguration {

	//Used in the DatabaseAccess class to submit JDBC Query String
	@Bean
	public NamedParameterJdbcTemplate NamedParamterJdbcTemplate(DataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}
}
