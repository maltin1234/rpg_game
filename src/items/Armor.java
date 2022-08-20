package items;

import attributes.Attributes;
import utils.Material;
import utils.Slot;


public class Armor extends Item {
    protected Material armorType;
    protected Attributes armorAttributes;


    public Attributes getArmorAttributes() {
        return armorAttributes;
    }

    public void setArmorAttributes(Attributes armorAttributes) {
        this.armorAttributes = armorAttributes;
    }




    public Armor(String name, int requiredLevel, Slot requiredSlot, Attributes armorAttributes, Material armorType) {
        super(name, requiredLevel, requiredSlot);
        this.armorType = armorType;
        this.armorAttributes = armorAttributes;
    }





    public boolean Equals(Armor checker){
        return name.equals(checker.name) &&
                requiredLevel == checker.requiredLevel &&
                requiredSlot.equals(checker.requiredSlot) &&
                armorType.equals(checker.armorType) &&
                armorAttributes.equals(checker);

    }
    public Material getType() {
        return armorType;
    }

    public void setType(Slot type) {
        this.armorType = armorType;
    }
    public int getMainAttributeMage(){
        return armorAttributes.getIntelligence();

    }
    public int getMainAttributeRanger(){
        return armorAttributes.getDexterity();

    }
    public int getMainAttributeRogue(){
        return armorAttributes.getDexterity();

    }
    public int getMainAttributeWarrior(){
        return armorAttributes.getStrength();

    }



    public Material getArmorType() {
        return armorType;
    }

    public void setArmorType(Material armorType) {
        this.armorType = armorType;
    }


}
