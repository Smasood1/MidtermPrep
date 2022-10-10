package FlightAppExam;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FlightCrewJob flightCrewJob1 = FlightCrewJob.PILOT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.FLIGHT_ATTENDANT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.CO_PILOT;

        CrewMember crewMember1 = new CrewMember("Saad",flightCrewJob1,95000.00f);
        CrewMember crewMember2 = new CrewMember("Sean",flightCrewJob2,55000.00f);
        CrewMember crewMember3 = new CrewMember("Paul",flightCrewJob3,35000.00f);

        Ticket planeTicket = new PlaneTicket(13215,"Maryland","NYC","43d",543.60,true);
        Ticket busTicket = new BusTicket(23526,"CA","CHI","23e",23.00);




        Passenger passenger57 = new Passenger("Saad",planeTicket,234.00, new String[] {"Red Bag","Yellow Bag","Green Bag"});
        Passenger passenger07 = new Passenger("Sean",planeTicket,245.00, new String[] {"Black Bag","White Bag"});

        System.out.println(passenger57.getAmtOfLuggage());
        System.out.println(passenger07.getTicket());
        crewMember2.serve(passenger57);

        ArrayList<FlightCrewJob> flightCrewJobs = new ArrayList<>();
        flightCrewJobs.add(flightCrewJob1);
        flightCrewJobs.add(flightCrewJob2);
        flightCrewJobs.add(flightCrewJob3);

        Payable [] payables = {planeTicket,busTicket,crewMember1,crewMember2,crewMember3};



        FlightApp.printEachFlightCrewJob(flightCrewJobs);
        FlightApp.sortAndPrintFlightCrewJobsByJobTitle(flightCrewJobs);
        FlightApp.printAmountForEachThingThatIsPayable(payables);
        FlightApp.printAllFlightCrewJobsExceptThisCrewMemberJob(flightCrewJobs,crewMember1);



    }
}

//saad masicsiox;269gh
