public class HiringManagerFactory {

    public Interviewer makeInterviewer(String interviewerType) {

        if (interviewerType.equals("Developer")) {
            return new Developer(interviewerType);
        } else if (interviewerType.equals("Community Executive")) {
            return new CommunityExecutive(interviewerType);
        } else {
            return null;
        }

    }
}
