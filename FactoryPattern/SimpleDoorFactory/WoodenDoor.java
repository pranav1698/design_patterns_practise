public class WoodenDoor implements Door {

    private double width;
    private double height;

    public WoodenDoor(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

}
