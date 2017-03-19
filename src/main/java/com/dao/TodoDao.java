package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TodoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String findTodo(int id) {
		String sql = "SELECT title from todo WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, String.class, id);
	}
}
