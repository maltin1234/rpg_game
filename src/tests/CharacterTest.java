package tests;

import attributes.Attributes;
import characters.classes.Mage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {
    @Test
    public void createMage_isCorrectLevel_level1(){
        Mage testMage = new Mage("Marin");
        int expected = 1;
        int actual;
        actual = testMage.getLevel();

        assertEquals(expected,actual);
    }
    @Test
    public void levelUpChar_isCorrLevel_level2(){
        Mage testMage = new Mage("Min");
        int expected = 2;
        int actual;
        testMage.levelUp();
        actual = testMage.getLevel();
        assertEquals(expected,actual);
    }

    @Test
    public void createMage_characterHasCorrectStats_primaryAttributes(){
        Mage testMage = new Mage("some");
        Attributes expected = new Attributes(1,1,8);
        Attributes actual = testMage.getBaseStatistics();
        assertEquals(expected,actual);

    }

    @Test
    public void levelUpMage_characterGainsCorrectStats_correctPrimaryAttributes(){
        Mage testMage = new Mage("Blerta");
        Attributes expected = new Attributes(2,2,13);
        Attributes actual = testMage.getBaseStatistics();
        testMage.levelUp();
        assertEquals(expected,actual);

    }


}
