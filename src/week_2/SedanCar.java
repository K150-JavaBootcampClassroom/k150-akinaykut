package week_2;

// This class created for car which type is Sedan
public class SedanCar extends AbstractCar {
    SedanCar(){
        super();
    }
    SedanCar(int luggageSize, int priceOfRent, int ageOfCar, String color) {
        super(luggageSize, priceOfRent, ageOfCar, color);
    }

    // This method calculate rent price
    public double calculateRentPrice(int day, int priceOfRent){
        return day * priceOfRent;
    }

    // This method rent a sedan car for a month
    public void rentACarForAMonth() {
        super.rentACar(30);
    }

    // This method rent a sedan car for a month with username information
    public void rentACarForAMonth(String customerName) {
        super.rentACar(30, customerName);
    }
}
