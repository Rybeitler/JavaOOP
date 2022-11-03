package com.ryanb.zookeeper.models;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}
	public void throwSomething() {
		System.out.println("Watch out! Gorilla threw something");
		setEnergyLevel(getEnergyLevel()-5);
		displayEnergy();
	}
	public void eatBananas() {
		System.out.println("Mmmm bannanas!");
		setEnergyLevel(getEnergyLevel()+10);
		displayEnergy();
	}
	public void climb() {
		System.out.println("The gorilla climbed a tree.");
		setEnergyLevel(getEnergyLevel()-10);
		displayEnergy();
	}
}
