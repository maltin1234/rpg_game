package tests;

import attributes.Attributes;
import characters.Character;
import characters.classes.Mage;
import characters.classes.Warrior;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.Armor;
import items.Item;
import items.Weapon;
import org.junit.jupiter.api.Test;
import utils.Material;
import utils.Slot;
import utils.Weapons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class EquipmentTest {

    @Test
    public void EquipItem_WeaponRequiredLevelToHigh_Exception(){
        Mage mage = new Mage("jonas");
        Item weapon = new Weapon("JOna",10, 200, 1, Weapons.AXES);
        assertThrows(InvalidWeaponException.class, () -> mage.equipMaterial(weapon));

    }
    @Test
    public void EquipItem_ArmorRequiredLevelToHigh_Exception(){
        Mage mage = new Mage("jonas");
        Item armor = new Armor("Jo",4,Slot.HEAD,new Attributes(2,2,13), Material.CLOTH);
        assertThrows(InvalidArmorException.class, () -> mage.equipMaterial(armor));

    }
    @Test
    public void EquipItem_WrongWeaponType_ExceptionThrown(){
        Warrior warr = new Warrior("Aajaj");
        Item weapon = new Weapon("Thoria elbow",1,999,1,Weapons.BOWS);
        assertThrows(InvalidWeaponException.class, () -> warr.equipMaterial(weapon));

    }
    @Test
    public void EquipItem_WrongArmorType_ExceptionThrown(){
        Warrior warrior = new Warrior("Elmond");

        Item headArmor = new Armor("JAina hood", 1,Slot.HEAD,new Attributes(1,2,10),Material.CLOTH);
        assertThrows(InvalidArmorException.class, () -> warrior.equipMaterial(headArmor));

    }
    @Test
    public void GetDps_NothingEquipped_CorrectDps(){
        Warrior warrior = new Warrior("The lich");
        double expected = (1+ 5.0 / 100);
        double actual = warrior.getCharacterDPs();

        assertEquals(expected, actual);
    }
    @Test
    public void GetDps_OnlyWeaponEquiped_CorrectDps(){
        Warrior warrior = new Warrior("warr");
        Item weapon = new Weapon("Thoria elbow",1,200,1.1,Weapons.SWORDS);
        warrior.equipMaterial(weapon);

        double expected = (200)* (1.1 + 5.0 / 100);
        double actual = warrior.getCharacterDPs();
        assertEquals(expected, actual);
    }


}
