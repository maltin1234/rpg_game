package attributes;

public class Attributes {
    private int Strength;
    private int Dexterity;
    private int Intelligence;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Attributes)) {
            return false;
        }
        Attributes attrObj = (Attributes) obj;
        // compare your values, returning false if they don't match
        // one example:

        if (this.Strength != attrObj.Strength) {
            return false;
        }
        if (this.Dexterity != attrObj.Dexterity) {
            return false;
        }
        return this.Intelligence == attrObj.Intelligence;
        // here, you would add your other comparisons and then finally, if all of them pass:
    }



    public Attributes(int strength, int dexterity, int intelligence) {
        Strength = strength;
        Dexterity = dexterity;
        Intelligence = intelligence;
    }


    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "Strength=" + Strength +
                ", Dexterity=" + Dexterity +
                ", Intelligence=" + Intelligence +
                '}';
    }



}
