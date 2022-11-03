package com.ryanb.zookeeper.models;

public class Bat extends Mammal {

	public Bat() {
		setEnergyLevel(300);
	}
	public void fly() {
		System.out.println("Woooosssshhh! it flew by....");
		setEnergyLevel(getEnergyLevel()-50);
		displayEnergy();
	}
	public void eatHumans() {
		System.out.println("Oh-well, nevermind");
		setEnergyLevel(getEnergyLevel()+25);
		displayEnergy();
	}
	public void attackTown() {
		System.out.println("Ahhhh its attacking the town!");
		setEnergyLevel(getEnergyLevel()-100);
		displayEnergy();
	}
}
