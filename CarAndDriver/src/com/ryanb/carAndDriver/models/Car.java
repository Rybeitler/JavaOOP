package com.ryanb.carAndDriver.models;

public class Car {
	private int gas;
	
	
	public Car() {
		this.gas = 10;
	}

	public void displayGas() {
		System.out.println("Gas: "+gas+"/10");
		if(gas<=0) {
			System.out.println("Game Over");
		}
	}
	
	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	
}
