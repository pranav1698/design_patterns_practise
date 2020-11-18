public class CommunityExecutive extends Interviewer {

    public CommunityExecutive(String newPosition) {
        this.setPosition(newPosition);
    }

    @Override
    public void askQuestions() {
        System.out.println(this.getPosition() + " is asking about community building!");
    }

}
