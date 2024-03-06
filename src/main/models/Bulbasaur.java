package main.models;

import main.interfaces.Plant;

public class Bulbasaur extends Pokemon implements Plant {

	String name = "Bulbasaur"; 
	
	public Bulbasaur() {}

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
	public void paralyze() {
		System.out.println("I'm a plant pokemon and this is my attack: paralyze");

	}

	@Override
	public void attackDrain() {
		System.out.println("I'm a plant pokemon and this is my attack: attackDrain");
	}

}
