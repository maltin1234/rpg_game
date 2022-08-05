import attributes.Attributes;
import characters.Character;
import characters.classes.Mage;
import characters.classes.Warrior;

public class Main {
    public static void main(String[] args) {
        Main obj = new  Main();

       Mage mage = new Mage("Johan",1);
        System.out.println(mage.getLevel());
        mage.levelUp();
        System.out.println(mage.getAttributes().getIntelligence());




    }
}