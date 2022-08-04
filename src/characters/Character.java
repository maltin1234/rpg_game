package characters;

import charlevel.Upgrade;

public abstract class Character implements Upgrade {
    private String name;
    private int level;
    private int primaryAttributes;
    private int totalAttributes;

    public Character(String name, int level, int primaryAttributes, int totalAttributes) {
        this.name = name;
        this.level = level;
        this.primaryAttributes = primaryAttributes;
        this.totalAttributes = totalAttributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPrimaryAttributes() {
        return primaryAttributes;
    }

    public void setPrimaryAttributes(int primaryAttributes) {
        this.primaryAttributes = primaryAttributes;
    }

    public int getTotalAttributes() {
        return totalAttributes;
    }

    public void setTotalAttributes(int totalAttributes) {
        this.totalAttributes = totalAttributes;
    }

    @Override
    public void levelUp() {
        System.out.println("hahhaha");
    }
}
