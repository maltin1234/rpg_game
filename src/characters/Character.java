package characters;


import attributes.Attributes;
import items.Armor;
import items.Item;
import items.Weapon;
import utils.Material;
import utils.Slot;
import utils.Weapons;

import java.util.HashMap;


public abstract class Character implements CanLevel{
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

    public void printChar(){
        for(var x : myInventory.entrySet()){
            System.out.println(x.getValue());
        }
        System.out.println(myInventory.size());
    }

    public void equipItem (Item item) {

        if (level == item.getRequiredLevel()) {
            if (item.getRequiredSlot() != Slot.WEAPON) {
                for (var mat : heroMaterial) {
                    if (mat.equals(((Armor) item).getMaterial())) {
                        myInventory.put(item.GetSlot(), item);
                    }
                }

            } else if (item.getRequiredSlot() == Slot.WEAPON) {
                for (var weap : heroWeapons) {
                    if (weap.equals(((Weapon) item).getWeaponType())) {
                        myInventory.put(item.GetSlot(), item);
                    }
                }
            }
        }else {
            System.out.println("level to low");
        }

    }





    /**public void armorStats(){

           // if (mat.equals(((Armor) item).getMaterial())) {
        for (var items : myInventory.entrySet()) {
            if (items instanceof Armor item) {
                getArmorAttributes((Armor) items);
                items.
            }
        }


    }**/


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
}
