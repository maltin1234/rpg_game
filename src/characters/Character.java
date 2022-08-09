package characters;


import attributes.Attributes;
import characters.classes.Mage;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.Armor;
import items.Item;
import items.Weapon;
import utils.Material;
import utils.Slot;
import utils.Weapons;

import java.util.HashMap;


public abstract class Character implements CanLevel, DisplayInterface{
    private String name;
    protected int level;
    // no hard coded value


    protected Attributes attributes;

    protected Attributes baseStatistics;
     protected Attributes totStatistics;


     protected double dmg = 1;



    Weapons[] heroWeapons;
    Material[] heroMaterial;


    public HashMap<Slot,Item> myInventory  = new HashMap<>();

    public Character(String name, int level, Attributes attributes, Weapons[] heroWeapons, Material[] heroMaterial) {
        this.name = name;
        this.level = level;
        this.attributes = attributes;
        this.heroWeapons = heroWeapons;
        this.heroMaterial = heroMaterial;

    }

    public abstract double CalculateDamage();

// Equiping armor
    public void equipMaterial (Item item) throws InvalidArmorException {

        if (level == item.getRequiredLevel()) {
            if (item.getRequiredSlot() != Slot.WEAPON) {
                for (var materialType : heroMaterial) {
                    if (materialType.equals(((Armor) item).getMaterial())) {
                        myInventory.put(item.GetSlot(), item);
                    }
                }
            } else {
                throw new InvalidArmorException("Cannot equip");
            }
        }
    }
    //Equip weapon method
        public void equipWeapon (Item item) throws InvalidWeaponException {
            if (level == item.getRequiredLevel()) {
                if (item.getRequiredSlot() == Slot.WEAPON) {
                    for (var weaponType : heroWeapons) {
                        if (weaponType.equals(((Weapon) item).getWeaponType())) {
                            myInventory.put(item.GetSlot(), item);
                        }
                    }
                }else{
                    throw new InvalidWeaponException("Cannot equip weapon");
                }
            }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Weapons[] getHeroWeapons() {
        return heroWeapons;
    }

    public void setHeroWeapons(Weapons[] heroWeapons) {
        this.heroWeapons = heroWeapons;
    }

    public Material[] getHeroMaterial() {
        return heroMaterial;
    }

    public void setHeroMaterial(Material[] heroMaterial) {
        this.heroMaterial = heroMaterial;
    }

    public HashMap<Slot, Item> getMyInventory() {
        return myInventory;
    }

    public void setMyInventory(HashMap<Slot, Item> myInventory) {
        this.myInventory = myInventory;
    }

    public Attributes getTotStatistics() {
        return totStatistics;
    }

    public void setTotStatistics(Attributes totStatistics) {
        this.totStatistics = totStatistics;
    }

    @Override
    public String displayCharacterStats() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: "+ this.name);
        builder.append("\nLevel: " + this.level);
        builder.append("\nStrength: " + attributes.getStrength());
        builder.append("\nDexterity: " + attributes.getDexterity());
        builder.append("\nIntelligence: " + attributes.getIntelligence());
        builder.append("\nDPS: " + this.dmg);
        return builder.toString();

    }

    // Calculate weapon damage
        public abstract double CalculateDamage(Mage mage);
}
