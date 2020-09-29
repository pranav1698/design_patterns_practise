class Bird extends Animal {
    public Bird() {
        setSound("Tweet");

        Flys newFlyingType = new ItFlys();
        setFlyingType(newFlyingType);
    }
}
