package com.mattheznunez.zookeeper;

public class Mammal {
	private int energy = 100;
	
	public Mammal(int energy) {
		this.energy = energy;
	}
	
	public int displayEnergy() {
		System.out.println(energy);
		return energy;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
}
