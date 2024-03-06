<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pokémon: Example of Object-Oriented Programming (OOP)</title>
</head>
<body>
    <h1>Pokémon: Example of Object-Oriented Programming (OOP)</h1>
    <p>In this repository, a practical example of Object-Oriented Programming (OOP) using the Pokémon world environment is presented. OOP is a programming paradigm based on the concept of "objects," which can contain data and functions. Here's how the main concepts of OOP were applied in this example:</p>

<h2>Classes and Objects</h2>

<ul>
    <li><strong>Pokémon Class (`Pokemon`):</strong> It's an abstract class that defines the common characteristics and behaviors of all Pokémon. This includes methods for generic attacks like <code>attackWithTackle()</code>, <code>attackWithScratch()</code>, and <code>attackWithBite()</code>.</li>
    <li><strong>Pokémon Subclasses (`Squirtle`, `Charmander`, `Bulbasaur`, `Pikachu`):</strong> Each of these classes represents a specific type of Pokémon. They inherit from the <code>Pokemon</code> class and provide concrete implementations for attack methods like <code>attackWithScratch()</code> and type-specific methods.</li>
</ul>

<h2>Interfaces</h2>

<p>Interfaces are a mechanism for defining a set of methods that must be implemented by a class. Here they are used to represent special abilities of certain types of Pokémon:</p>

<ul>
    <li><strong><code>Electric</code> Interface:</strong> Defines methods like <code>thunderImpact()</code> and <code>thunderFist()</code> representing electric abilities.</li>
    <li><strong><code>Fire</code> Interface:</strong> Defines methods like <code>flamethrower()</code> and <code>fireFist()</code> representing fire abilities.</li>
    <li><strong><code>Plant</code> Interface:</strong> Defines methods like <code>paralyze()</code> and <code>attackDrain()</code> representing plant abilities.</li>
</ul>

<h2>Main Implementation</h2>

<p><strong><code>Main</code> Class:</strong> Here each type of Pokémon is instantiated, and a specific attack is invoked for each one. This demonstrates how different types of Pokémon can have unique behaviors while still sharing common characteristics.</p>

<p>This example illustrates how OOP allows organizing and structuring code in a way that is easier to understand and maintain. Each class and interface represents a clear abstraction of Pokémon world concepts, making it easier to manipulate and extend the code. Additionally, the use of inheritance and polymorphism allows the code to be more flexible and reusable.</p>

<p>I hope this technical explanation has been helpful in understanding how the principles of OOP were applied in this specific example. If there are any further questions, feel free to ask. Enjoy exploring the code!</p>

</body>
</html>
