package week_2;

public class SuvCar extends AbstractCar {

    SuvCar(){
        super();
    }
    SuvCar(int luggageSize, int priceOfRent, int ageOfCar, String color) {
        super(luggageSize, priceOfRent, ageOfCar, color);
    }

    @Override
    public double calculateRentPrice(int day, int priceOfRent) {
        return day * priceOfRent * (getAgeOfCar() * 1.2);
    }


    public void rentACarForAMonth() {
        this.rentACar(30);
    }

}
