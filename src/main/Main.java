package main;

import main.models.Bulbasaur;
import main.models.Charmander;
import main.models.Pikachu;
import main.models.Squirtle;

public class Main {

	public static void main(String[] args) {

		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();
		Bulbasaur bulbasaur = new Bulbasaur();
		Pikachu pikachu = new Pikachu();
		
		squirtle.attackWithScratch();
		charmander.flamethrower();
		bulbasaur.paralyze();
		pikachu.thunderImpact();
	}

}
