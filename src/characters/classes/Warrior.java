package characters.classes;

import attributes.Attributes;
import characters.Character;
import utils.Material;
import utils.Weapons;

import java.util.List;

public class Warrior  extends Character {


    public Warrior(String name) {
        super(name, new Attributes(5,2,1), List.of(Weapons.AXES,Weapons.SWORDS, Weapons.HAMMERS), List.of(Material.PLATE));
    }

    @Override
    public void levelUp() {
        baseStatistics.setStrength(baseStatistics.getStrength() + 1 );
        baseStatistics.setDexterity(baseStatistics.getDexterity() + 5 );
        baseStatistics.setIntelligence(baseStatistics.getIntelligence() + 1 );
    }

    @Override
    protected int getMainPrimaryAttribute() {
        return baseStatistics.getStrength();
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
