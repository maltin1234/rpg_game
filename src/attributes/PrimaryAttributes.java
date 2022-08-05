package attributes;

public class PrimaryAttributes {
    private int primStrength;
    private int primDexterity;
    private int primIntelligence;

    public PrimaryAttributes(int primStrength, int primDexterity, int primIntelligence) {
        this.primStrength = primStrength;
        this.primDexterity = primDexterity;
        this.primIntelligence = primIntelligence;
    }

    public int getPrimStrength() {
        return primStrength;
    }

    public void setPrimStrength(int primStrength) {
        this.primStrength = primStrength;
    }

    public int getPrimDexterity() {
        return primDexterity;
    }

    public void setPrimDexterity(int primDexterity) {
        this.primDexterity = primDexterity;
    }

    public int getPrimIntelligence() {
        return primIntelligence;
    }

    public void setPrimIntelligence(int primIntelligence) {
        this.primIntelligence = primIntelligence;
    }
}
