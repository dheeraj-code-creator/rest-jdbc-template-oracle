package com.rest.jpa.oracle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.rest.jpa.oracle.dto.DemoDto;
import com.rest.jpa.oracle.util.QueryUtil;

@Repository
public class DemoDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@SuppressWarnings("rawtypes")
	public List<DemoDto> getResultForUserId(int id) {
		QueryUtil queryUtil = new QueryUtil();
		String queryForId = queryUtil.getUserInformation(id);
		SqlParameterSource sqlParameterSource = new MapSqlParameterSource("T2_ID", id);
		@SuppressWarnings("unchecked")
		List<DemoDto> demoList = namedParameterJdbcTemplate.query(queryForId, 
				                                               sqlParameterSource,
															   new BeanPropertyRowMapper(DemoDto.class));
		return demoList;
	}

}
