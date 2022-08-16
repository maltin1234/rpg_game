package characters.classes;

import attributes.Attributes;
import characters.Character;
import items.Weapon;
import utils.Material;
import utils.Slot;
import utils.Weapons;

public class Ranger extends Character {


    public Ranger(String name, Attributes baseStatistics) {
        super(name, new Attributes(1,7,7));
    }

    @Override
    public void levelUp() {
        level++;
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

