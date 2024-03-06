package main.models;

public abstract class Pokemon {

	protected int pokedexNumber;
	protected String name;
	protected double weight;
	protected String gender;
	protected int season;

	abstract protected void attackWithTackle();
	abstract protected void attackWithScratch();
	abstract protected void attackWithBite();
}
