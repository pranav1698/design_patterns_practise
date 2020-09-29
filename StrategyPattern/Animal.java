class Animal {
    private String name;
    private double height;
    private String sound;

    // A new flyingType variable to store if the animal can fly or not
    // Interface is not used in a traditional way, we use it as an instance
    // variable

    // Animal class knows that this behaviour is available to its subclasses
    // Instead of inheriting an ability the class is composed of objects with the
    // right ability. This allows change in behaviour of objects at run time.
    private Flys flyingType;

    public void setName(String newName) {
        name = newName;
    };

    public String getName() {
        return name;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public double getHeight() {
        return height;
    }

    public void setSound(String newSound) {
        sound = newSound;
    }

    public String getSound() {
        return sound;
    }

    // Animal transfers the responsiblity of Flying to Flys interface(flyingType)
    public String toFly() {
        return flyingType.fly();
    }

    public void setFlyingType(Flys newFlyingType) {
        flyingType = newFlyingType;
    }

}