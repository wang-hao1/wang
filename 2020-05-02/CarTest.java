package com.wh.Demo;



public class CarTest {

	public static void main(String[] args) {
		Car car=new Car();
		car.setBrand("大众宝来");
		car.setModel("小型汽车");
		car.setPrice(144000);
		car.setFuelConsumption(5.9);
		car.setMileage(500);
		car.setFuelTankVolume(55);
		
		double oilConsumption;//剩余流量
		oilConsumption=(car.getMileage()/100)*car.getFuelConsumption();
		car.remainingFuel=car.getFuelTankVolume()-oilConsumption;
		if(car.remainingFuel<5){
			System.out.println("油量不够，请加油");
		}else{
			System.out.println("油量充足");
		}
		System.out.println(car.toString());
		System.out.println("里程数:"+car.getMileage()+",剩余油量:"+car.remainingFuel);

	}
	
	
	

}
