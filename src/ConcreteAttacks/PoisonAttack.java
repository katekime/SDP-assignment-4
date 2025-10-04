package ConcreteAttacks;

import AttackInterface.AttackInterface;

public class PoisonAttack implements AttackInterface {
    @Override
    public void applyEffect() {
        System.out.println("the weapon poisons the enemy!");
    }
}
