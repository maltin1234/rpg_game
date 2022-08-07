package items;

import characters.Character;
import utils.Slot;

public abstract class Item implements ChooseWeapon {
    protected String name;
    protected int requiredLevel;
    protected Slot requiredSlot;




    @Override
    public int GetLevel() {
        return requiredLevel;
    }

    @Override
    public Slot GetSlot() {
        return requiredSlot;
    }

    public Item(String name, int requiredLevel, Slot requiredSlot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.requiredSlot = requiredSlot;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public Slot getRequiredSlot() {
        return requiredSlot;
    }

    public void setRequiredSlot(Slot requiredSlot) {
        this.requiredSlot = requiredSlot;
    }


}



