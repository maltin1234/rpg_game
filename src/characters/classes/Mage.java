package characters.classes;

import attributes.Attributes;
import characters.Character;

import utils.Material;
import utils.Weapons;

import java.util.List;

public class Mage extends Character {
    /**
     * Constructor
     * @param name
     */
    public Mage(String name) {


        super(name, new Attributes(1,1,8), List.of(Weapons.AXES),List.of(Material.CLOTH) );
    }

    /**
     * Level up Mage
     * Update attributes values
     */
    @Override
    public void levelUp() {
       level++;
       baseStatistics.setDexterity(baseStatistics.getDexterity() + 1 );
       baseStatistics.setStrength(baseStatistics.getStrength() + 1 );
       baseStatistics.setIntelligence(baseStatistics.getIntelligence() + 5 );


    }

    /**
     * Get heroes main primary attribute
     * @return
     */
    @Override
    protected int getMainPrimaryAttribute() {
        return baseStatistics.getIntelligence();
    }

    /**
     * Get strength from heroes (calculateTotalStats attribute)
     * Character class calculateStats gives total attributes with armor equipped
     * I can then access  one of the total main attributes here
     * @return
     */
    @Override
    protected double calculateTotalMainAttribute() {
        return calculateTotalStats().getStrength() ;
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

















