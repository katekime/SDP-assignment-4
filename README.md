Game Weapon System
Introduction

In this small project, I decided to implement the Bridge Pattern using a simple game example.
The idea was to create a system where different types of weaponscan have different attack effects.
Instead of mixing all logic in one class, I separated them into two independent parts: weapons and attack effects.
This makes the program flexible, clean, and easy to extend later.

Program Structure

The program is divided into several packages:

Abstraction – contains the abstract Weapon class.
It has a reference to an interface called AttackInterface, which represents the type of effect the weapon will use.

AttackInterface – defines the interface AttackInterface with the method applyEffect().
This is the “bridge” between weapons and their effects.

ConcreteAttacks – contains specific attack implementations:

FireAttack – burns the enemy with fire

IceAttack – freezes the enemy

PoisonAttack – poisons the enemy

ConcreteWeapons – includes three concrete weapon classes:

Sword – close combat weapon

Bow – ranged weapon

Staff – magic weapon

Main class – runs the program. It asks the user to choose a weapon and an attack effect, then creates objects and performs the attack.

The result changes depending on the combination the user picks.
You can mix any weapon with any effect — for example, a “Fire Staff” or “Ice Sword”.

Clean Code Principles

While writing the code, I tried to follow a few basic Clean Code principles:

Readable names – all classes and variables clearly describe their purpose.

Single responsibility – every class has one clear task.

Open/Closed principle – I can add new weapons or effects without modifying the old code.

Low coupling – weapons don’t depend directly on attack implementations.

Short and simple methods – each method does only one thing and is easy to understand.

Conclusion
In this project, I implemented the Bridge Pattern in a simple but clear way.
Weapons and attack effects are separated, which makes the system easy to modify and expand.
This example shows how design patterns can make even small programs more organized and maintainable.
If I wanted, I could easily add new things — for example, a LightningAttack or a Dagger weapon — without touching the existing code.
