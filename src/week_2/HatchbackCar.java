package week_2;

// This class created for car which type is Hatchback
public class HatchbackCar extends AbstractCar {
    // The constructor methods
    HatchbackCar() {
        super();
    }
    HatchbackCar(int luggageSize, int priceOfRent, int ageOfCar, String color) {
        super(luggageSize, priceOfRent, ageOfCar, color);
    }

    // This method calculate rent price
    @Override
    public double calculateRentPrice(int day, int priceOfRent) {
        return day * priceOfRent;
    }

}
