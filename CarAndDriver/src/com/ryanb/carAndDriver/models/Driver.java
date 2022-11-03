package com.ryanb.carAndDriver.models;

public class Driver extends Car{

	public Driver() {
		super();
	}
	
	public void drive() {
		System.out.println("Driving along....");
		setGas(getGas() -1);
		displayGas();
	}
	public void useBoosters() {
		if(getGas()>3) {
			System.out.println("Using boosters!");
			setGas(getGas() -3);
			displayGas();
		}else {
			System.out.println("Not enough gas");
		}
	}
	public void refuel() {
		if(getGas()<=8) {
			System.out.println("Stopping for gas.....");
			setGas(getGas() +2);
			displayGas();
		}else {
			System.out.println("Dont need fuel.");
		}
	}
}
