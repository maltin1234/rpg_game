package items;

import attributes.Attributes;
import utils.Material;
import utils.Slot;


public class Armor extends Item {
    protected Material material;
    protected Attributes attributes;

    protected Material Type;


    public Material getType() {
        return Type;
    }

    public void setType(Material type) {
        Type = type;
    }

    public Armor(String name, int requiredLevel, Slot requiredSlot, Material material, Attributes attributes, Material type) {
        super(name, requiredLevel, requiredSlot);
        this.material = material;
        this.attributes = attributes;
        Type = type;
    }
    public boolean Equals(Armor checker){
        return name.equals(checker.name) &&
                requiredLevel == checker.requiredLevel &&
                requiredSlot.equals(checker.requiredSlot) &&
                material.equals(checker.material) &&
                attributes.equals(checker);

    }
    public int getMainAttributeMage(){
        return attributes.getIntelligence();

    }
    public int getMainAttributeRanger(){
        return attributes.getIntelligence();

    }
    public int getMainAttributeRogue(){
        return attributes.getIntelligence();

    }
    public int getMainAttributeWarrior(){
        return attributes.getIntelligence();

    }

    @Override
    public void equipWeapon() {

    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}
