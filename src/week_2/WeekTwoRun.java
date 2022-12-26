package week_2;

public class WeekTwoRun {

    public static void main(String[] args){

      // We have two different object to rent a car

      // The citizen object could only rent a hatchback car
      Citizen ali = new Citizen("Ali");

      // The company object could rent all cars
      Company ubisoft = new Company("Ubisoft");

      // The Hatchback cars rent only for one day long.


      ali.rentAHatchbackCarForADay();
      ubisoft.rentASuvCarForAMonth();
      ubisoft.rentASuvCarForADay();
      ubisoft.rentASedanCarForAMonth();
      ubisoft.rentASedanCarForADay();
      ubisoft.rentAHatchbackCarForADay();
    }
}
