package characters.classes;

import attributes.Attributes;
import characters.Character;
import utils.Material;
import utils.Weapons;

import java.util.List;

public class Mage extends Character {
    public Mage(String name) {


        super(name, new Attributes(1,1,8), List.of(Weapons.AXES),List.of(Material.CLOTH) );
    }

    @Override
    public void levelUp() {
       level++;
       baseStatistics.setDexterity(baseStatistics.getDexterity() + 1 );
       baseStatistics.setStrength(baseStatistics.getStrength() + 1 );
       baseStatistics.setIntelligence(baseStatistics.getIntelligence() + 5 );


    }

    @Override
    protected int getMainPrimaryAttribute() {
        return baseStatistics.getIntelligence();
    }

    @Override
    protected double calculateTotalMainAttribute() {
        return calculateTotalStats().getStrength();
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

















