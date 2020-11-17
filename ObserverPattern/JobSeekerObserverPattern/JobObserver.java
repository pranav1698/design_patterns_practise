public class JobObserver implements Observer {
    private String name;
    private int observerId;

    private static int observerTracker;

    public JobObserver(String newObserver) {
        this.name = newObserver;
        this.observerId = ++observerTracker;

    }

    @Override
    public void onJobPosted(JobPost j) {
        System.out.println("Hi " + this.name + " (" + this.observerId + ")" + "! New Job Posted: " + j.getTitle());
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.observerId;
    }

}
