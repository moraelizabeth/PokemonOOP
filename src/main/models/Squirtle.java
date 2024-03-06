package main.models;

import main.interfaces.Water;

public class Squirtle extends Pokemon implements Water{

	String name = "Squirtle"; 
	
	@Override
	protected void attackWithTackle() {
		System.out.println("I am " + name + " and this is my attack: attackWithTackle");
	}

	@Override
	protected void attackWithScratch() {
		System.out.println("I am " + name + " and this is my attack: attackWithScratch");
	}

	@Override
	protected void attackWithBite() {
		System.out.println("I am " + name + " and this is my attack: attackWithBite");
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