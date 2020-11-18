import java.util.Scanner;

public class InterviewerTesting {

    public static void main(String[] args) {
        HiringManagerFactory managerFactory = new HiringManagerFactory();

        Scanner input = new Scanner(System.in);
        String interviewerOption = "";
        if (input.hasNextLine()) {
            interviewerOption = input.nextLine();
        }

        doStuffInterviewer(managerFactory.makeInterviewer(interviewerOption));
    }

    public static void doStuffInterviewer(Interviewer interviewerPosition) {
        interviewerPosition.askQuestions();
    }
}
