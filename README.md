# Pokémon: Example of Object-Oriented Programming (OOP)

In this repository, a practical example of Object-Oriented Programming (OOP) using the Pokémon world environment is presented. OOP is a programming paradigm based on the concept of "objects," which can contain data and functions. Here's how the main concepts of OOP were applied in this example:

## Classes and Objects

- **Pokémon Class (Pokemon):** It's an abstract class that defines the common characteristics and behaviors of all Pokémon. This includes methods for generic attacks like `attackWithTackle()`, `attackWithScratch()`, and `attackWithBite()`.

- **Pokémon Subclasses (Squirtle, Charmander, Bulbasaur, Pikachu):** Each of these classes represents a specific type of Pokémon. They inherit from the Pokemon class and provide concrete implementations for attack methods like `attackWithScratch()` and type-specific methods.

## Interfaces

Interfaces are a mechanism for defining a set of methods that must be implemented by a class. Here they are used to represent special abilities of certain types of Pokémon:

- **Electric Interface:** Defines methods like `thunderImpact()` and `thunderFist()` representing electric abilities.

- **Fire Interface:** Defines methods like `flamethrower()` and `fireFist()` representing fire abilities.

- **Plant Interface:** Defines methods like `paralyze()` and `attackDrain()` representing plant abilities.

## Main Implementation

- **Main Class:** Here each type of Pokémon is instantiated, and a specific attack is invoked for each one. This demonstrates how different types of Pokémon can have unique behaviors while still sharing common characteristics.

This example illustrates how OOP allows organizing and structuring code in a way that is easier to understand and maintain. Each class and interface represents a clear abstraction of Pokémon world concepts, making it easier to manipulate and extend the code. Additionally, the use of inheritance and polymorphism allows the code to be more flexible and reusable.
