package characters.classes;

import attributes.Attributes;
import characters.Character;
import items.Weapon;
import utils.Material;
import utils.Slot;
import utils.Weapons;

public class Rogue extends Character {


    public Rogue(String name, Attributes baseStatistics) {
        super(name, new Attributes(2,6,1));
    }

    @Override
    public void levelUp() {
        baseStatistics.setStrength(baseStatistics.getStrength() + 1 );
        baseStatistics.setDexterity(baseStatistics.getDexterity() + 4 );
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