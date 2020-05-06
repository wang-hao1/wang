package com.wh.Demo;
/**
 * 
 * @author wh
 * @date   2020年5月6日
 */
public class Car {
	String brand;//品牌
	String model;//车型
	Integer price;//价格
	double fuelConsumption;//油耗
	double mileage;//里程数
	double fuelTankVolume;//油箱容积
	double remainingFuel;//剩余油量
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public double getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getFuelTankVolume() {
		return fuelTankVolume;
	}
	public void setFuelTankVolume(double fuelTankVolume) {
		this.fuelTankVolume = fuelTankVolume;
	}
	public double getRemainingFuel() {
		return remainingFuel;
	}
	public void setRemainingFuel(double remainingFuel) {
		this.remainingFuel = remainingFuel;
	}
	
	public Car(){
		
	}
	public Car(String brand, String model, Integer price, double fuelConsumption, double mileage, double fuelTankVolume,
			double remainingFuel) {
		brand = brand;
		this.model = model;
		this.price = price;
		this.fuelConsumption = fuelConsumption;
		this.mileage = mileage;
		this.fuelTankVolume = fuelTankVolume;
		this.remainingFuel = remainingFuel;
	}
	
	
	

}
