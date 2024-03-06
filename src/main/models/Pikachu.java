package main.models;

import main.interfaces.Electric;

public class Pikachu extends Pokemon implements Electric{

	String name = "Pikachu"; 
	
	public Pikachu() {}
	
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
	public void thunderImpact() {
		System.out.println("I'm a electric pokemon and this is my attack: thunderImpact");
	}

	@Override
	public void thunderFist() {
		System.out.println("I'm a electric pokemon and this is my attack: thunderFist");
	}

}