package com.carchoiceapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


	
@Entity
public class Car 	{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer carId ;
	private String brand;
	private String model;
	private int releaseYear;
	private int noOfKms;
	private int price ;
	private String fuel;
	
	public Car() {
	}

	public Car(String brand, String model, int releaseYear, int noOfKms, int price, String fuel) {
		super();
		this.brand = brand;
		this.model = model;
		this.releaseYear = releaseYear;
		this.noOfKms = noOfKms;
		this.price = price;
		this.fuel = fuel;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getNoOfKms() {
		return noOfKms;
	}

	public void setNoOfKms(int noOfKms) {
		this.noOfKms = noOfKms;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + releaseYear + ", noOfKms=" + noOfKms + ", price="
				+ price + ", fuel=" + fuel + "]";
	}

	
}
