package week_3.FlyApp;

import java.time.Clock;
import java.time.LocalDateTime;

public class PegasusAirlines extends AirlineCompany {



    public PegasusAirlines() {
        super("Pegasus Airlines");

        Clock clock = Clock.systemUTC();
        LocalDateTime time = LocalDateTime.now(clock);
        VoyageType voyageType1 = VoyageType.domestic;
        VoyageType voyageType2 = VoyageType.international;
        getVoyages().add(new Voyage(time, voyageType1, 350.0));
        getVoyages().add(new Voyage(time, voyageType2, 500));


    }


}
