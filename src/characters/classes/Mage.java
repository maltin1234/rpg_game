package characters.classes;

import attributes.Attributes;
import characters.Character;
import items.Armor;
import items.Weapon;
import utils.Material;
import utils.Slot;
import utils.Weapons;

public class Mage extends Character {
    public Mage(String name) {


        super(name, new Attributes(1,1,8));
    }

    @Override
    public void levelUp() {
       level++;
       baseStatistics.setDexterity(baseStatistics.getDexterity() + 1 );
       baseStatistics.setStrength(baseStatistics.getStrength() + 1 );
       baseStatistics.setIntelligence(baseStatistics.getIntelligence() + 5 );


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

















