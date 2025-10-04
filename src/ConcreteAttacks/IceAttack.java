package ConcreteAttacks;

import AttackInterface.AttackInterface;

public class IceAttack implements AttackInterface {
    @Override
    public void applyEffect() {
        System.out.println("the weapon freezes the enemy with ice!");
    }
}
