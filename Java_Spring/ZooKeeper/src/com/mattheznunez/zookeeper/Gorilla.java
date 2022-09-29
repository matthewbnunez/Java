package com.mattheznunez.zookeeper;

public class Gorilla extends Mammal{
	public Gorilla() {
		super(100);
	}
	public void throwSomething() {
		System.out.println("The Gorilla throw something!");
		this.setEnergy(this.getEnergy() - 5);
	}
	public void eatBananas() {
		System.out.println("The Gorilla eats a banana.");
		this.setEnergy(this.getEnergy() + 10);
	}
	public void climb() {
		System.out.println("The Gorilla climbed up a tree.");
		this.setEnergy(this.getEnergy() - 10);
	}
}
