public abstract class EnemyShip {

    private String name;
    private double damage;

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getDamage() {
        return this.damage;
    }

    public void setDamage(double newDamage) {
        this.damage = newDamage;
    }

    public void followHeroShip() {
        System.out.println(getName() + " is following the hero");
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void shootEnemyShip() {
        System.out.println(getName() + " attacks and does " + getDamage());
    }

}