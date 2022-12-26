package week_2;

public class HatchbackCar extends AbstractCar {

    HatchbackCar() {
        super();
    }
    HatchbackCar(int luggageSize, int priceOfRent, int ageOfCar, String color) {
        super(luggageSize, priceOfRent, ageOfCar, color);
    }

    @Override
    public double calculateRentPrice(int day, int priceOfRent) {
        return day * priceOfRent;
    }

}
