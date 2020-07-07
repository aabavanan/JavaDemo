package org.Abstract;

public class AllCar extends Mycars {

	@Override
	public void hyundaiCar() {
		System.out.println("This is i20 car");
	}

	@Override
	public void audiCar() {
		
		System.out.println("This is Audi Car");
	}
	
	public static void main(String[] args) {
		
		AllCar obj = new AllCar();
		obj.hyundaiCar();
		obj.audiCar();
		obj.mercedesCar();
		
	}


}
