package com.rest.jpa.oracle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.jpa.oracle.dao.DemoDao;
import com.rest.jpa.oracle.dto.DemoDto;

@Service
public class DemoService {

	@Autowired
	DemoDao demoDao;

	public List<DemoDto> getUserDetailsById(int id) {
		List<DemoDto> demoDtoList = new ArrayList<>();
		demoDtoList = demoDao.getResultForUserId(id);
		return demoDtoList;
	}

}
