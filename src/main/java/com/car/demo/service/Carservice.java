package com.car.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.demo.dao.Cardao;
import com.car.demo.entity.Car;

@Service
public class Carservice {
@Autowired
Cardao carDao;

public String addInfo(Car carentity) {
	return carDao.addInfo(carentity);
}
public List<Car>getAll(){
	return carDao.getAll();
	}

public String deleteId( int id) {
	return carDao.deleteId(id);
	
}
public Car getInfo(int id) {
	return carDao.getInfo(id);
}
}	