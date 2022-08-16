package characters;


import attributes.Attributes;
import characters.classes.Mage;
import characters.classes.Ranger;
import characters.classes.Rogue;
import characters.classes.Warrior;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.Armor;
import items.Item;
import items.Weapon;
import utils.Material;
import utils.Slot;
import utils.Weapons;

import java.util.HashMap;


public abstract class Character implements CanLevel, DisplayInterface, CharacterStats {
    private String name;
    protected int level = 1;
    protected Attributes baseStatistics;
    protected Attributes totStatistics;
    protected double characterDPs;

    Weapons[] heroWeapons;
    Material[] heroMaterial;

    public HashMap<Slot, Item> myInventory = new HashMap<>();

    public Character(String name,Attributes baseStatistics) {
        this.name = name;
        this.baseStatistics = baseStatistics;

    }




    // Equiping armor
    public void equipMaterial(Item item) throws InvalidArmorException {

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
    public void equipWeapon(Item item) throws InvalidWeaponException {
        if (level == item.getRequiredLevel()) {
            if (item.getRequiredSlot() == Slot.WEAPON) {
                for (var weaponType : heroWeapons) {
                    if (weaponType.equals(((Weapon) item).getWeaponType())) {
                        myInventory.put(item.GetSlot(), item);
                    }
                }
            } else {
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

    public Attributes getBaseStatistics() {
        return baseStatistics;
    }

    public void setBaseStatistics(Attributes baseStatistics) {
        this.baseStatistics = baseStatistics;
    }

    public Attributes getTotStatistics() {
        return totStatistics;
    }

    public void setTotStatistics(Attributes totStatistics) {
        this.totStatistics = totStatistics;
    }

    public double getCharacterDPs() {
        return characterDPs;
    }

    public void setCharacterDPs(double characterDPs) {
        this.characterDPs = characterDPs;
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
}




