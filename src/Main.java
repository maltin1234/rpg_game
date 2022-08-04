import characters.Character;
import characters.classes.Warrior;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Warrior warrior = new Warrior("james", 2, 2,2);
        warrior.levelUp();
    }
}