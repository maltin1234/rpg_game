package characters.classes;

import attributes.Attributes;
import characters.Character;
import utils.Material;
import utils.Weapons;

import java.util.List;

public class Ranger extends Character {


    public Ranger(String name, Attributes baseStatistics) {
        super(name, new Attributes(1,7,7), List.of(Weapons.AXES), List.of(Material.PLATE));
    }

    @Override
    public void levelUp() {
        level++;
        baseStatistics.setStrength(baseStatistics.getStrength() + 1 );
        baseStatistics.setDexterity(baseStatistics.getDexterity() + 5 );
        baseStatistics.setIntelligence(baseStatistics.getIntelligence() + 1 );

    }

    @Override
    protected int getMainPrimaryAttribute() {
        return baseStatistics.getDexterity();
    }

    @Override
    protected double calculateTotalMainAttribute() {
        return calculateTotalStats().getStrength();
    }

    @Override
    public Attributes calculateTotalStats() {

        return null;
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

