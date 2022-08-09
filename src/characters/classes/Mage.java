package characters.classes;

import attributes.Attributes;
import characters.Character;
import items.Armor;
import items.Weapon;
import utils.Material;
import utils.Slot;
import utils.Weapons;

public class Mage extends Character {
    //public Attributes attributes;

    public Mage(String name, int level) {
        super(name, level, new Attributes(1,1,8), new Weapons[] {Weapons.WAND, Weapons.STAFFS}, new Material[] {Material.CLOTH});
    }
    @Override
    public void levelUp() {
        level++;
        attributes.setDexterity(attributes.getDexterity() + 1 );
        attributes.setStrength(attributes.getStrength() + 1 );
        attributes.setIntelligence(attributes.getIntelligence() + 5 );
    }

    public void totalAttribute(Mage mage){
        for (var item: mage.myInventory.entrySet()
             ) {
        if(item instanceof Armor ) {

        }
        }
    }

   public double CalculateDamage(Mage mage)
   {

           // If Dictionary not contains the key of enum WEAPON
           if (mage.myInventory.containsKey(Slot.WEAPON) ==false ) return dmg;

           if(mage.myInventory.containsKey(Slot.WEAPON) != false)
           {
               Weapon weapon = (Weapon) myInventory.get(Slot.WEAPON); // Get the weapon in inventory
               double damage = (double)(weapon.getDamage() * (1 + attributes.getIntelligence() / 100)); // Damage formula
               return damage;
           }

           return dmg; // Needed for all code paths
       }

   }










