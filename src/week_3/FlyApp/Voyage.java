package week_3.FlyApp;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Voyage {

   private LocalDateTime time;
   private String direction;
   private String departurePoint;
   private Plane plane;
   private HashMap<String, String> passengers;
    {
        passengers = new HashMap<>();
    }
    VoyageType voyageType;
    double price;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public HashMap<String, String> getPassengers() {
        return passengers;
    }

    public void setPassengers(HashMap<String, String> passengers) {
        this.passengers = passengers;
    }

    public VoyageType getVoyageType() {
        return voyageType;
    }

    public void setVoyageType(VoyageType voyageType) {
        this.voyageType = voyageType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Voyage(LocalDateTime time, VoyageType voyageType, double price) {

        this.time = time;
        this.plane = new Plane();
        plane.getChairList().forEach((key, value) -> {
            passengers.put(key, "");
        });
        this.price = price;
        this.voyageType = voyageType;
    }

    public void voyageInfo() {
        System.out.println("Time: " + time);
        System.out.println("Passengers: ");
        passengers.forEach((key, value) -> {
            if(value.length() > 0) {
                System.out.println("Passenger: " + value + " | " +  "chair number: " + key);
            }
        });
    }

    public void addPassenger(String chairNumber, String passenger) {
        passengers.put(chairNumber, passenger);
    }
    public void emptyChairs() {
        System.out.println("Available chair list");
        plane.getChairList().forEach((key, value) -> {
            if(!value) {
                System.out.print(key + ", ");
            }


        });

    }

}
