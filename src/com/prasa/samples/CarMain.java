package com.prasa.samples;

public class CarMain {

	public static void main(String[] args) {
		Number num=new Number(30);

		Car c = new Car(45, 3, 3);
		System.out.println(c.applyBreaks());
		System.out.println(c.changeGear());
		System.out.println(c.speedUp());
		System.out.println(c.changeSignal());
	    System.out.println(Car.nameOfCar);
	    System.out.println(Car.getNumberOfCars());
	   
	}

}
