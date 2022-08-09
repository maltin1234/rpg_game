package characters.classes;

import attributes.Attributes;
import characters.Character;
import items.Armor;
import utils.Material;
import utils.Weapons;

public class Rogue extends Character {

    public Rogue(String name, int level, Attributes attributes, Material[] heroMaterial, Weapons[] heroWeapons) {
        super(name, level, attributes, heroWeapons, heroMaterial);
    }


    @Override
    public void levelUp() {
        level++;
        attributes.setDexterity(attributes.getDexterity() + 4 );
        attributes.setStrength(attributes.getStrength() + 1 );
        attributes.setIntelligence(attributes.getIntelligence() + 1 );
    }
}
