package characters.classes;

import attributes.Attributes;
import characters.Character;
import items.Weapon;
import utils.Material;
import utils.Slot;
import utils.Weapons;

public class Ranger extends Character {


    public Ranger(String name, int level, Attributes attributes, Weapons[] heroWeapons, Material[] heroMaterial) {
        super(name, level, attributes, heroWeapons, heroMaterial);
    }

    @Override
    public double CalculateDamage(Ranger ranger) {
        // If Dictionary not contains the key of enum WEAPON
        if (ranger.myInventory.containsKey(Slot.WEAPON) ==false ) return dmg;

        if(ranger.myInventory.containsKey(Slot.WEAPON) != false)
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
        attributes.setDexterity(attributes.getDexterity() + 5 );
        attributes.setStrength(attributes.getStrength() + 1 );
        attributes.setIntelligence(attributes.getIntelligence() + 1 );
    }
}

