package characters.classes;

import attributes.Attributes;
import characters.Character;

public class Warrior  extends Character {
    public Warrior(String name, int level) {
        super(name, level, new Attributes(5,2,1));
    }

    @Override
    public void levelUp() {
        level++;
        attributes.setDexterity(attributes.getDexterity() + 2 );
        attributes.setStrength(attributes.getStrength() + 3 );
        attributes.setIntelligence(attributes.getIntelligence() + 1 );
    }


}
