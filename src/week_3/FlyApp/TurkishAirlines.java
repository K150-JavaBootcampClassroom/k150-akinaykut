package week_3.FlyApp;

import java.time.Clock;
import java.time.LocalDateTime;

public class TurkishAirlines extends AirlineCompany{


    public TurkishAirlines() {
        super("Turkish Airlines");

        Clock clock = Clock.systemUTC();
        LocalDateTime time = LocalDateTime.now(clock);
        VoyageType voyageType1 = VoyageType.domestic;
        VoyageType voyageType2 = VoyageType.international;
        getVoyages().add(new Voyage(time, voyageType1, 250.0));
        getVoyages().add(new Voyage(time, voyageType2, 400.0));
    }
}
