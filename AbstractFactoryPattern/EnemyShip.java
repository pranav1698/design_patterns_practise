public abstract class EnemyShip {

    private String name;
    ESWeapon weapon;
    ESEngine engine;

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    abstract void makeShip();

    public String toString() {
        return ("The " + name + " has a top speed of " + engine + " and an attack power of " + weapon);
    }

}
