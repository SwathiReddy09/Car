package com.car.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Car")
public class Car {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String colour;
public int cost;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
}
