public class AnimalPlay {
    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.toFly());
        System.out.println("Bird: " + tweety.toFly());

        // In runtime, if suddenly our instance gets the ability to fly
        sparky.setFlyingType(new ItFlys());
        System.out.println("Dog: " + sparky.toFly());
    }
}
