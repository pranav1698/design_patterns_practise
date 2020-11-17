public class GrabJobs {

    public static void main(String[] args) {
        // Creating Observer(Subscriber)
        JobObserver observer1 = new JobObserver("Rahul Das");
        JobObserver observer2 = new JobObserver("Rohini Gupta");

        // Creating Subject(Publisher)
        EmploymentAgency linkedin = new EmploymentAgency();
        linkedin.attach(observer1);
        linkedin.attach(observer2);

        JobPost SoftwareEngineer = new JobPost("Software Engineer");
        linkedin.addJob(SoftwareEngineer);

        linkedin.detach(observer1);

        JobPost SoftwareDevelopmentEngineer = new JobPost("Software Development Engineer");
        linkedin.addJob(SoftwareDevelopmentEngineer);
    }

}
