package characters.classes;

import attributes.Attributes;
import characters.Character;
import items.Armor;
import utils.Material;
import utils.Weapons;

public class Warrior  extends Character {
    public Warrior(String name, int level, Attributes attributes, Weapons[] heroWeapons, Material[] heroMaterial) {
        super(name, level, attributes, heroWeapons, heroMaterial);
    }


    @Override
    public void levelUp() {
        level++;
        attributes.setDexterity(attributes.getDexterity() + 2 );
        attributes.setStrength(attributes.getStrength() + 3 );
        attributes.setIntelligence(attributes.getIntelligence() + 1 );
    }
}
