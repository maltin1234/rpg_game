package characters;
import attributes.Attributes;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.Armor;
import items.Item;
import items.Weapon;
import utils.Material;
import utils.Slot;
import utils.Weapons;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public abstract class Character implements CanLevel, DisplayInterface, CharacterStats {
    // Fields
    private String name;
    protected int level = 1;
    protected Attributes baseStatistics;
    protected Attributes totStatistics;
    protected double characterDPs;

    protected List<Weapons> validWeaponType ;
    protected List<Material> validMaterialType;

    public HashMap<Slot, Item> myInventory = new HashMap<>();
// Constructor
    public Character(String name, Attributes baseStatistics,List<Weapons> validWeaponType, List<Material> validMaterialType) {
        this.name = name;
        this.baseStatistics = baseStatistics;
        this.validWeaponType = validWeaponType;
        this.validMaterialType = validMaterialType;
    }
    // Abstract methods
    protected abstract int getMainPrimaryAttribute();
    protected abstract double calculateTotalMainAttribute();


    /**
     * Calculate total attributes if armor is equiped and weapon equiped
     * Accessing calculateTotalStats in Character classes
     */
    public  Attributes calculateTotalStats(){

     var strength = 0;
     var intelligence = 0;
     var dexterity = 0;
            for (var armorItem: myInventory.entrySet()){
                if (armorItem instanceof Armor armor){
                    strength += armor.getArmorAttributes().getStrength() + baseStatistics.getStrength();
                    intelligence += armor.getArmorAttributes().getIntelligence() + baseStatistics.getIntelligence();
                    dexterity += armor.getArmorAttributes().getDexterity() + baseStatistics.getDexterity();
                }

            }


        return new Attributes(strength,dexterity,intelligence);
    }
    //Displays your hero name, level and current attributes from hero and armor.
    public String getHeroInfo() {
        return "Name: " + name + "\n" +
                "Level: " + level + "\n" +
                "Total Attributes:\n" +
                "Strength: " + calculateTotalStats().getStrength() + "\n" +
                "Dexterity: " + calculateTotalStats().getDexterity() + "\n" +
                "Intelligence: " + calculateTotalStats().getIntelligence() + "\n";
    }

    /**
     *
     * @param item
     * @throws InvalidWeaponException
     * @throws InvalidArmorException
     */
    public void equipMaterial(Item item) throws InvalidWeaponException, InvalidArmorException {
        if(item.GetSlot() == Slot.WEAPON){

            checkWeaponSlot(item);
        }else {
            checkMaterialSlot(item);
        }
    myInventory.put(item.GetSlot(), item);

}

    /**
     * Check if it is possible to equip armor
     * @param item
     * @throws InvalidArmorException
     */
    private void checkMaterialSlot(Item item) throws InvalidArmorException {
        Material type = (((Armor) item).getType());
        boolean canEquip = validMaterialType.contains(type);
        if(level < item.getRequiredLevel()) {
            throw new InvalidArmorException("Level to high");
        }
        if(!canEquip){
            throw new InvalidArmorException("You cannot equip" + "" + type);
        }
    }

    /**
     * If weapon can not be equiped
     * @param item
     * @throws InvalidWeaponException
     */
    private void checkWeaponSlot(Item item) throws InvalidWeaponException {
        Weapons type = (((Weapon) item).getWeaponsType());
        boolean canEquip = validWeaponType.contains(type);
        if(level < item.getRequiredLevel()) {
            throw new InvalidWeaponException("Level to high");
        }
        if(!canEquip){
            throw new InvalidWeaponException("You cannot equip" + "" + type);
        }
    }

    /**
     * Get values from character classes and return character dps
     * @return
     */
    public double getCharacterDPs() {
        double mainAttribute = getMainPrimaryAttribute();
        mainAttribute += calculateTotalMainAttribute();

        if (myInventory.get(Slot.WEAPON ) != null){
            return ((Weapon) myInventory.get(Slot.WEAPON)).getDamagePerSecond() * (1 + mainAttribute / 100);

        }
        else{
            return (1 + mainAttribute / 100);
        }

    }

    /**
     * Getters and setter
     */
    public HashMap<Slot, Item> getMyInventory() {
        return myInventory;
    }

    public void setMyInventory(HashMap<Slot, Item> myInventory) {
        this.myInventory = myInventory;
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


    public void setCharacterDPs(double characterDPs) {
        this.characterDPs = characterDPs;
    }

    public List<Weapons> getValidWeaponType() {
        return validWeaponType;
    }

    public void setValidWeaponType(List<Weapons> validWeaponType) {
        this.validWeaponType = validWeaponType;
    }

    public List<Material> getValidMaterialType() {
        return validMaterialType;
    }
    public void setValidMaterialType(List<Material> validMaterialType) {
        this.validMaterialType = validMaterialType;
    }
}




