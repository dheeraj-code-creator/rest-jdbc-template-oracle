package com.rest.jpa.oracle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.rest.jpa.oracle.entity.Demo;
import com.rest.jpa.oracle.util.QueryUtil;

@Repository
public class DemoDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public List<Demo> getResultForUserId(int id) {
		QueryUtil queryUtil = new QueryUtil();
		String queryForId = queryUtil.getUserInformation(id);
		SqlParameterSource sqlParameterSource = new MapSqlParameterSource("T2_ID", id);
		RowMapper<Demo> mapper = new DemoMapper();
		List<Demo> demoList = namedParameterJdbcTemplate.query(queryForId, sqlParameterSource, mapper);
		return demoList;
	}

}
