import attributes.Attributes;
import characters.Character;
import characters.classes.Mage;
import characters.classes.Warrior;
import exceptions.InvalidWeaponException;
import items.Armor;
import items.Item;
import items.Weapon;
import utils.Material;
import utils.Slot;
import utils.Weapons;

public class Main {
    public static void main(String[] args) {

      Character mage = new Mage("JOhan");
        System.out.println(mage.getLevel());
        System.out.println(mage.getBaseStatistics());
      mage.levelUp();
        System.out.println(mage.getBaseStatistics());
        Weapon weapon = new Weapon("axe", 2, 20, 2,Weapons.STAFFS);
        mage.equipMaterial(weapon);
        Armor items = new Armor("Common plate body Armor",1,Slot.BODY,new Attributes(1,1,1), Material.PLATE);
        mage.equipMaterial(items);









    }
}