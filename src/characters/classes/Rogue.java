package characters.classes;

import attributes.Attributes;
import characters.Character;

public class Rogue extends Character {

    public Rogue(String name, int level) {
        super(name, level, new Attributes(2,6,1));
    }

    @Override
    public void levelUp() {
        level++;
        attributes.setDexterity(attributes.getDexterity() + 4 );
        attributes.setStrength(attributes.getStrength() + 1 );
        attributes.setIntelligence(attributes.getIntelligence() + 1 );
    }

}
