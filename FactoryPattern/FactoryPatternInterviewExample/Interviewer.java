public abstract class Interviewer {

    private String position;

    public abstract void askQuestions();

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

}