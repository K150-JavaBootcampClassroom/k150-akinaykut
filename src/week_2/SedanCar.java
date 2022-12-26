package week_2;

public class SedanCar extends AbstractCar {
    SedanCar(){
        super();
    }
    SedanCar(int luggageSize, int priceOfRent, int ageOfCar, String color) {
        super(luggageSize, priceOfRent, ageOfCar, color);
    }

    public double calculateRentPrice(int day, int priceOfRent){
        return day * priceOfRent;
    }

    public void rentACarForAMonth() {
        this.rentACar(30);
    }
}
