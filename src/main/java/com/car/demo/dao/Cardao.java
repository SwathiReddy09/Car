package com.car.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.car.demo.entity.Car;
import com.car.demo.repo.Carrepo;

@Repository
public class Cardao {
	@Autowired
 Carrepo carRepository;

	public String addInfo(Car carentity) {
		carRepository.save(carentity);
		return "car insurance was added";
		
}
	public List<Car>getAll(){
		return carRepository.findAll();
		
	}
	public String deleteId(int id) {
	carRepository.deleteById(id);	
	return"insurance was expired";
	}
	public Car getInfo(int id) {
		return carRepository.findById(id).get();
	}
}