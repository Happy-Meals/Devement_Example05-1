package ca.sheridancollege.BingChenSun.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.BingChenSun.controller.bean.User;


@Repository
public class UserDataAccess {

	@Autowired
	protected NamedParameterJdbcTemplate jdbc;
	
	public long addUser(User user) {
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		String insert = "INSERT INTO user (name, email, phone)" +
						"VALUES (:name, :email, :phone);";
		namedParameters.addValue("name", user.getName());
		namedParameters.addValue("email", user.getEmail());
		namedParameters.addValue("phone", user.getPhone());
		int rowsAffected = jdbc.update(insert, namedParameters);
		return rowsAffected;
	}
	
	public List<User> selectUsers(){
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		String query = "SELECT * FROM user";
		return jdbc.query(query, namedParameters, new BeanPropertyRowMapper<User>(User.class));
	}
}