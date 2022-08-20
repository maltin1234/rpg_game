package items;

import characters.Character;
import utils.Slot;
import utils.Weapons;

import javax.lang.model.element.Name;

public class Weapon extends Item {

   private int Damage;
   private double AttackSpeed;
   protected double DamagePerSecond;
   protected Weapons Type;

    public Weapon(String name, int requiredLevel, int damage, double attackSpeed, Weapons type) {
        super(name, requiredLevel, Slot.WEAPON);
        Damage = damage;
        AttackSpeed = attackSpeed;
        DamagePerSecond = damage * attackSpeed;
        Type = type;
    }

    public  Weapons getWeaponType() {
        return Type;
    }


    @Override
    public Slot GetSlot() {
        return requiredSlot;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public double getAttackSpeed() {
        return AttackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        AttackSpeed = attackSpeed;
    }

    public double getDamagePerSecond() {
        return DamagePerSecond;
    }

    public void setDamagePerSecond(double damagePerSecond) {
        DamagePerSecond = damagePerSecond;
    }

    public Weapons getType() {
        return Type;
    }

    public void setType(Weapons type) {
        Type = type;
    }
}