package FlightAppExam;

public class CrewMember extends Person implements servAble, Payable{

    private FlightCrewJob job;
    private float salary;

    public CrewMember(String name, FlightCrewJob job, float salary) {
        super(name);
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "job=" + job +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void printPaymentAmount() {
        System.out.println(this.salary);

    }

    @Override
    public void serve(Person person) {
        System.out.println("Now Serving "+ getName());
    }

    public FlightCrewJob getJob() {
        return job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }
}
