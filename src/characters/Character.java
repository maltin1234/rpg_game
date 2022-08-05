package characters;


import attributes.Attributes;


public abstract class Character implements CanLevel {
    private String name;
    protected int level;
    // no hard coded value


    protected Attributes attributes;



    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Character(String name,int level,  Attributes attributes) {
        this.name = name;

        this.level = level;
        this.attributes = attributes;


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






}
