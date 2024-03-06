package main.models;

public abstract class Pokemon {

	protected int pokedexNumber;
	protected String name;
	protected double weight;
	protected String gender;
	protected int season;

	protected abstract void attackWithTackle();
	protected abstract void attackWithScratch();
	protected abstract void attackWithBite();
}
