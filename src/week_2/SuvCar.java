package week_2;

// This class created for car which type is SUV
public class SuvCar extends AbstractCar {

    // The constructor methods
    SuvCar(){
        super();
    }
    SuvCar(int luggageSize, int priceOfRent, int ageOfCar, String color) {
        super(luggageSize, priceOfRent, ageOfCar, color);
    }

    // This method calculate rent price
    @Override
    public double calculateRentPrice(int day, int priceOfRent) {
        return day * priceOfRent * (getAgeOfCar() * 1.2);
    }

    // This method rent a suv car for a month
    public void rentACarForAMonth() {
        this.rentACar(30);
    }

    // This method rent a suv car for a month with username information
    public void rentACarForAMonth(String customerName) {
        this.rentACar(30, customerName);
    }

}
