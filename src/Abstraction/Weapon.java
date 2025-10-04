package Abstraction;

import AttackInterface.AttackInterface;

public abstract class Weapon {
    protected AttackInterface effect;

    protected Weapon(AttackInterface effect) {
        this.effect = effect;
    }

    public abstract void attack();
}
