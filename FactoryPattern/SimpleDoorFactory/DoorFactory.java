public class DoorFactory {

    public Door makeDoor(double width, double height) {
        return new WoodenDoor(width, height);
    }
}
