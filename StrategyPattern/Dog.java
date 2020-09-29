class Dog extends Animal {
    public void digHole() {
        System.out.println("Dug a hole");
    }

    public Dog() {
        setSound("Bark");

        // We will now create new instance, of the CantFly type class
        // We cannot create instance of the Flys interface but we can create instance of
        // classes that implements this interface
        Flys newFlyingType = new CantFly();

        //
        setFlyingType(newFlyingType);
    }

    /*
     * BAD You could override the fly method, but we are breaking 24 the rule that
     * we need to abstract what is different to 25 the subclasses 26
     *
     * 27 public void fly(){ 28
     * 
     * 29 System.out.println("I can't fly"); 30
     * 
     * 31 } 32
     */

}