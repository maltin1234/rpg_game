package characters.classes;

import attributes.Attributes;
import characters.Character;
import utils.Material;
import utils.Weapons;

import java.util.List;

public class Rogue extends Character {

    /**
     * Constructor
     * @param name
     */
    public Rogue(String name) {
        super(name, new Attributes(2,6,1), List.of(Weapons.AXES), List.of(Material.PLATE));
    }
    /**
     * Level up Rogue
     * Update attributes values
     */
    @Override
    public void levelUp() {
        baseStatistics.setStrength(baseStatistics.getStrength() + 1 );
        baseStatistics.setDexterity(baseStatistics.getDexterity() + 4 );
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

        return calculateTotalStats();
    }

    @Override
    public double calculateCharacterDps() {
        return characterDPs;
    }


    @Override
    public String displayCharacterStats() {
        return null;
    }
}