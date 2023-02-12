package com.carchoiceapp;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface CarRepo extends CrudRepository<Car, Integer>{

	public List<Car> findByBrand(String brand);
	public List<Car> findByPrice(int price);
}
