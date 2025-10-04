package ConcreteWeapons;

import Abstraction.Weapon;
import AttackInterface.AttackInterface;

public class Staff extends Weapon {
    public Staff(AttackInterface effect) {
        super(effect);
    }

    @Override
    public void attack() {
        System.out.println("staff casts the spell!");
        effect.applyEffect();
    }
}
