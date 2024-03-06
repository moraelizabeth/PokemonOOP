package main.models;

import main.interfaces.Fire;

public class Charmander extends Pokemon implements Fire {

	String name = "Charmander"; 
	
	public Charmander() {}

	@Override
	protected void attackWithTackle() {
		System.out.println("I'm " + name + " and this is my attack: attackWithTackle");
	}

	@Override
	protected void attackWithScratch() {
		System.out.println("I'm " + name + " and this is my attack: attackWithScratch");
	}

	@Override
	protected void attackWithBite() {
		System.out.println("I'm " + name + " and this is my attack: attackWithBite");
	}

	@Override
	public void flamethrower() {
		System.out.println("I'm a fire pokemon and this is my attack: flamethrower");
	}

	@Override
	public void fireFist() {
		System.out.println("I'm a fire pokemon and this is my attack: fireFist");
	}

}