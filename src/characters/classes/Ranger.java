package characters.classes;

import attributes.Attributes;
import characters.Character;

public class Ranger extends Character {
    public Ranger(String name, int level) {
        super(name, level, new Attributes(1,7,1));
    }

    @Override
    public void levelUp() {
        level++;
        attributes.setDexterity(attributes.getDexterity() + 5 );
        attributes.setStrength(attributes.getStrength() + 1 );
        attributes.setIntelligence(attributes.getIntelligence() + 1 );
    }
}

