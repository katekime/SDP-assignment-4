package ConcreteAttacks;

import AttackInterface.AttackInterface;

public class FireAttack implements AttackInterface {
    @Override
    public void applyEffect() {
        System.out.println("the weapon burns the enemy with fire!");
    }
}
