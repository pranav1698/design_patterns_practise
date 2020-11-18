public class Developer extends Interviewer {

    public Developer(String newPosition) {
        this.setPosition(newPosition);
    }

    @Override
    public void askQuestions() {
        System.out.println(this.getPosition() + " is asking about Design Patterns!");
    }

}
