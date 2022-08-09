package characters.classes;

import attributes.Attributes;
import characters.Character;
import items.Weapon;
import utils.Material;
import utils.Slot;
import utils.Weapons;

public class Warrior  extends Character {
    public Warrior(String name, int level, Attributes attributes, Weapons[] heroWeapons, Material[] heroMaterial) {
        super(name, level, attributes, heroWeapons, heroMaterial);
    }

    @Override
    public double CalculateDamage(Warrior warrior) {
        // If Dictionary not contains the key of enum WEAPON
        if (warrior.myInventory.containsKey(Slot.WEAPON) ==false ) return dmg;

        if(warrior.myInventory.containsKey(Slot.WEAPON) != false)
        {
            Weapon weapon = (Weapon) myInventory.get(Slot.WEAPON); // Get the weapon in inventory
            double damage = (double)(weapon.getDamage() * (1 + attributes.getIntelligence() / 100)); // Damage formula
            return damage;
        }

        return dmg; // Needed for all code paths
    }


    @Override
    public void levelUp() {
        level++;
        attributes.setDexterity(attributes.getDexterity() + 2 );
        attributes.setStrength(attributes.getStrength() + 3 );
        attributes.setIntelligence(attributes.getIntelligence() + 1 );
    }
}
