package FlightAppExam;

import java.util.Comparator;

public class FlightCrewJobCompare implements Comparator<FlightCrewJob> {

    @Override
    public int compare(FlightCrewJob o1, FlightCrewJob o2) {
        return o1.compareTo(o2);
    }
}
