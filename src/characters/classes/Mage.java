package characters.classes;

import attributes.Attributes;
import characters.Character;

public class Mage extends Character {
    //public Attributes attributes;

    public Mage(String name, int level) {

        super(name, level, new Attributes(1,1,8));

    }


    @Override
    public void levelUp() {
        level++;
        attributes.setDexterity(attributes.getDexterity() + 1 );
        attributes.setStrength(attributes.getStrength() + 1 );
        attributes.setIntelligence(attributes.getIntelligence() + 8 );
    }
}
