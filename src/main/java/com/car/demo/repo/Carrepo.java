package com.car.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car.demo.entity.Car;

public interface Carrepo extends JpaRepository<Car,Integer > {

}
