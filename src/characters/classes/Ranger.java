package characters.classes;

import attributes.Attributes;
import characters.Character;
import utils.Material;
import utils.Weapons;

import java.util.List;

public class Ranger extends Character {
    /**
     * Constructor
     * @param name
     */
    public Ranger(String name) {
        super(name, new Attributes(1,7,1), List.of(Weapons.AXES), List.of(Material.PLATE));
    }
    /**
     * Level up Ranger
     * Update attributes values
     */
    @Override
    public void levelUp() {
        level++;
        baseStatistics.setStrength(baseStatistics.getStrength() + 1 );
        baseStatistics.setDexterity(baseStatistics.getDexterity() + 5 );
        baseStatistics.setIntelligence(baseStatistics.getIntelligence() + 1 );

    }

    /**
     * Get character main attribute
     */
    @Override
    protected int getMainPrimaryAttribute() {
        return baseStatistics.getDexterity();
    }
    /**
     * Get strength from heroes (calculateTotalStats attribute)
     * Character class calculateStats gives total attributes with armor equipped
     * Access  one of the total main attributes here
     * @return
     */
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

