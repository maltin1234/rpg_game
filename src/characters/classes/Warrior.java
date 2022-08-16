package characters.classes;

import attributes.Attributes;
import characters.Character;
import items.Weapon;
import utils.Material;
import utils.Slot;
import utils.Weapons;

public class Warrior  extends Character {


    public Warrior(String name, Attributes baseStatistics) {
        super(name, new Attributes(5,2,1));
    }

    @Override
    public void levelUp() {
        baseStatistics.setStrength(baseStatistics.getStrength() + 1 );
        baseStatistics.setDexterity(baseStatistics.getDexterity() + 5 );
        baseStatistics.setIntelligence(baseStatistics.getIntelligence() + 1 );
    }

    @Override
    public void calculateTotalStats() {

    }

    @Override
    public double calculateCharacterDps() {
        return 0;
    }

    @Override
    public String displayCharacterStats() {
        return null;
    }
}
