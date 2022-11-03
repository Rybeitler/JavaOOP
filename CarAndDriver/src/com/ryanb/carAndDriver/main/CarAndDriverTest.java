package com.ryanb.carAndDriver.main;

import com.ryanb.carAndDriver.models.Driver;

public class CarAndDriverTest {

	public static void main(String[] args) {
		Driver speedRacer = new Driver();
		
		speedRacer.drive();
		speedRacer.drive();
		speedRacer.drive();
		speedRacer.drive();
		
		speedRacer.useBoosters();
		
		speedRacer.refuel();
		speedRacer.refuel();
		speedRacer.refuel();
		speedRacer.refuel();
	}

}
