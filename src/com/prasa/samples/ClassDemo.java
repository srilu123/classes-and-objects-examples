package com.prasa.samples;

public class ClassDemo  {

	private int speed;
	private int gear;


	public ClassDemo(int speed, int gear) {
	
		this.speed = speed;
		this.gear = gear;
	

	}

	public int speedUp() {
		return ++speed;
	}

	public int changeGear() {
		return ++gear;
	}
	
	
}
