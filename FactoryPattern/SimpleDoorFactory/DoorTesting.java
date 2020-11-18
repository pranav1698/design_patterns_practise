public class DoorTesting {

    public static void main(String[] args) {
        DoorFactory doorFactory = new DoorFactory();

        Door door1 = doorFactory.makeDoor(100, 200);
        System.out.println("The door made has " + door1.getHeight() + " height and width " + door1.getWidth());

        Door door2 = doorFactory.makeDoor(50, 100);
        System.out.println("The door made has " + door2.getHeight() + " height and width " + door2.getWidth());
    }

}
