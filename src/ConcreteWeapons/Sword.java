package ConcreteWeapons;

import Abstraction.Weapon;
import AttackInterface.AttackInterface;

public class Sword extends Weapon {
    public Sword(AttackInterface effect) {
        super(effect);
    }

    @Override
    public void attack() {
        System.out.println("sword kills the enemy!");
        effect.applyEffect();
    }
}
