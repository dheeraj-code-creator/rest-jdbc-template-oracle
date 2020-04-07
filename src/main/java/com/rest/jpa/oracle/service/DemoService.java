package com.rest.jpa.oracle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.jpa.oracle.dao.DemoDao;
import com.rest.jpa.oracle.entity.Demo;

@Service
public class DemoService {

	@Autowired
	DemoDao demoDao;

	public List<Demo> getUserDetailsById(int id) {
		List<Demo> demoList = new ArrayList<>();
		demoList = demoDao.getResultForUserId(id);
		return demoList;
	}

}
