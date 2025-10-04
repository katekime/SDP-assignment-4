import Abstraction.Weapon;
import AttackInterface.AttackInterface;
import ConcreteAttacks.*;
import ConcreteWeapons.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AttackInterface effect;
        Weapon weapon;
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your weapon: Sword, Bow, Staff");
        String weaponChoice = sc.nextLine();
        System.out.println("Choose your attack effect: Fire, Ice, Poison");
        String effectChoice = sc.nextLine();


        if (effectChoice .equalsIgnoreCase("Fire")) {
            effect = new FireAttack();
        } else if (effectChoice.equalsIgnoreCase("Ice")) {
            effect = new IceAttack();
        } else if (effectChoice.equalsIgnoreCase("Poison")) {
            effect = new PoisonAttack();
        } else {
            System.out.println("Invalid attack type. Default is fire");
            effect = new FireAttack();
        }

        if (weaponChoice.equalsIgnoreCase("sword")) {
            weapon = new Sword(effect);
        } else if (weaponChoice.equalsIgnoreCase("bow")) {
            weapon = new Bow(effect);
        } else if (weaponChoice .equalsIgnoreCase("Staff")) {
            weapon = new Staff(effect);
        } else {
            System.out.println("Invalid weapon type. Default is Sword.");
            weapon = new Sword(effect);
        }

        System.out.println("Battle started");
        weapon.attack();
    }
}