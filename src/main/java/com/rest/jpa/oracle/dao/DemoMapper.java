package com.rest.jpa.oracle.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rest.jpa.oracle.entity.Demo;


public class DemoMapper implements RowMapper<Demo>{

	@Override
	public Demo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Demo demoObj = new Demo();
		demoObj.setId(rs.getInt("T2_ID"));
		demoObj.setName(rs.getString("T2_NAME"));
		demoObj.setMonthlySalry(rs.getInt("T2_MONSALARY"));
		return demoObj;
	}

}
