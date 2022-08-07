import attributes.Attributes;
import characters.Character;
import characters.classes.Mage;
import characters.classes.Warrior;
import items.Item;
import items.Weapon;
import utils.Slot;
import utils.Weapons;

public class Main {
    public static void main(String[] args) {
        Main obj = new  Main();

       Mage mage = new Mage("Johan",1);
       Weapon weapon = new Weapon("Axe",1,2,3, Weapons.AXES);
        System.out.println(weapon.getDamagePerSecond());


    }
}