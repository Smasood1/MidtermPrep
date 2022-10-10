package FlightAppExam;

import java.util.*;


public class FlightApp {

    public static void printEachFlightCrewJob(ArrayList<FlightCrewJob> flightCrewJobs){
        //loop through the array with for loop
        for (FlightCrewJob x : flightCrewJobs){
            System.out.println(x);
        }

    }


    public static void printAmountForEachThingThatIsPayable(Payable[] payables){
    //print the price of all items in payable array

        //for(int x = 0; x < payables.length; x++){
        for (Payable payable : payables) {
            payable.printPaymentAmount();
        }
    }

    public static void sortAndPrintFlightCrewJobsByJobTitle(ArrayList<FlightCrewJob> flightCrewJobs){
        Comparator jc = new FlightCrewJobCompare();
        Collections.sort(flightCrewJobs,jc);
        for(FlightCrewJob x : flightCrewJobs){

            System.out.println(x);
        }


    }

    public static void printAllFlightCrewJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> flightCrewJobs,CrewMember crewMember){
        //iterator
        Iterator<FlightCrewJob> flightCrewJobIterator = flightCrewJobs.iterator();

        for (Iterator<FlightCrewJob> it = flightCrewJobIterator; it.hasNext(); ) {
            FlightCrewJob x = it.next();

            if(x != crewMember.getJob()){
                System.out.println(x);

            }


        }

    }
}

