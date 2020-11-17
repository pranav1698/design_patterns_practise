import java.util.ArrayList;

public class EmploymentAgency implements Subject {
    ArrayList<Observer> observers;

    public EmploymentAgency() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void attach(Observer newObserver) {
        this.observers.add(newObserver);
    }

    @Override
    public void detach(Observer deletedObserver) {
        int indexOfObserver = this.observers.indexOf(deletedObserver);
        System.out.println("Deleting " + ((JobObserver) deletedObserver).getName() + " with ID "
                + ((JobObserver) deletedObserver).getId());
        this.observers.remove(indexOfObserver);

    }

    @Override
    public void notifyObserver(JobPost newJobPost) {
        for (Observer observer : observers) {
            observer.onJobPosted(newJobPost);
        }
    }

    // Adding Job Posting
    public void addJob(JobPost newJobPosting) {
        this.notifyObserver(newJobPosting);
    }

}
