package com.car.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.demo.entity.Car;
import com.car.demo.service.Carservice;



@RestController
public class Carcontroller {
@Autowired
Carservice carService;
public static Logger logger=LoggerFactory.getLogger(Carcontroller.class);
@PostMapping(value="/add")
public String addInfo(@RequestBody Car carEntity) {
	return carService.addInfo(carEntity);
}
@GetMapping(value="/display")

public List<Car> getAll(){
	logger.info("This class execute first");
	return carService.getAll();
	
}
@GetMapping(value="/display/{id}")
public Car getInfo(@PathVariable int id) {
	return carService.getInfo(id);
}
}