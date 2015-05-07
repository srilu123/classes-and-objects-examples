package com.prasa.samples;

public class Car extends ClassDemo implements CarInterface {
    private int signal;
	private int breaks;
	public static String nameOfCar="Honda City";
	private static int numberOfCars=11;

	public Car(int speed, int gear, int breaks) {
		super(speed, gear);
		this.breaks = breaks;
	}

	public int applyBreaks() {
		return --breaks;
	}

	@Override
	public String changeSignal() {
		String signalName;
	int signal =2;
		switch (signal) {
		case 1:
			signalName = "Red";
			break;
		case 2:
			signalName = "Yellow";
			break;
		case 3:
			signalName = "Green";
			break;
		default:
			return "Turn left";
		}

		return signalName;
	}
	public static int getNumberOfCars(){
		return numberOfCars;
		
	}
	static{
		 int a = 3;
	}
}
