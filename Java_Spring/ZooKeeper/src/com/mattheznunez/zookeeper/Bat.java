package com.mattheznunez.zookeeper;

public class Bat extends Mammal{
	public Bat() {
		super(300);
	}
	public void fly() {
		System.out.println("The sound of a bat taking off.");
		this.setEnergy(this.getEnergy() - 50);
	}
	public void eatHumans() {
		System.out.println("Not good!");
		this.setEnergy(this.getEnergy() + 25);
	}
	public void attackTown() {
		System.out.println("The town's on fire!!!");
		this.setEnergy(this.getEnergy() - 100);
	}
}
