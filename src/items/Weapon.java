package items;

import utils.Slot;
import utils.Weapons;



public class Weapon extends Item {

   private int Damage;
   private double AttackSpeed;
   protected double DamagePerSecond;
   protected Weapons weaponsType;

    public Weapon(String name, int requiredLevel, int damage, double attackSpeed, Weapons weaponsType) {
        super(name, requiredLevel, Slot.WEAPON);
        Damage = damage;
        AttackSpeed = attackSpeed;
        DamagePerSecond = damage * attackSpeed;
        this.weaponsType = weaponsType;
    }

    public  Weapons getWeaponType() {
        return weaponsType;
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

    public Weapons getWeaponsType() {
        return weaponsType;
    }

    public void setWeaponsType(Weapons weaponsType) {
        this.weaponsType = weaponsType;
    }
}