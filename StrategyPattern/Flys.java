public interface Flys {
    String fly();
}

class ItFlys implements Flys {
    public String fly() {
        return "Flying High";
    }
}

class CantFly implements Flys {
    public String fly() {
        return "Can't Fly";
    }
}