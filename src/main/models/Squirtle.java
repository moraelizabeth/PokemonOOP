package main.models;

import main.interfaces.Water;

public class Squirtle extends Pokemon implements Water{

	String name = "Squirtle"; 
	
	public Squirtle() {}
	
	@Override
	public void attackWithTackle() {
		System.out.println("I'm " + name + " and this is my attack: attackWithTackle");
	}
	
	@Override
	public void attackWithScratch() {
		System.out.println("I'm " + name + " and this is my attack: attackWithScratch");
	}

	@Override
	public void attackWithBite() {
		System.out.println("I'm " + name + " and this is my attack: attackWithBite");
	}

	@Override
	public void hydropump() {
		System.out.println("I'm a water pokemon and this is my attack: hydropump");
	}

	@Override
	public void attackBubbles() {
		System.out.println("I'm a water pokemon and this is my attack: attackBubbles");
	}

}