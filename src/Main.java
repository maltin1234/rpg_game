import attributes.Attributes;
import characters.Character;
import characters.classes.Mage;
import characters.classes.Warrior;
import items.Armor;
import items.Item;
import items.Weapon;
import utils.Slot;
import utils.Weapons;

public class Main {
    public static void main(String[] args) {
        Main obj = new  Main();

       Mage mage = new Mage("Johan",1);
       Weapon weapon = new Weapon("Staffs",1,2,3, Weapons.STAFFS);
        System.out.println(weapon.getDamagePerSecond());






    }
}