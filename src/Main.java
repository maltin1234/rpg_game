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
      Character mage = new Mage("JOhan");
        System.out.println(mage.getLevel());
        System.out.println(mage.getBaseStatistics());
      mage.levelUp();
        System.out.println(mage.getBaseStatistics());










    }
}