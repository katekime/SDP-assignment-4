package ConcreteWeapons;

import Abstraction.Weapon;
import AttackInterface.AttackInterface;

public class Bow extends Weapon {
    public Bow(AttackInterface effect) {
        super(effect);
    }

    @Override
    public void attack() {
        System.out.println("bow shoots arrow!");
        effect.applyEffect();
    }
}
