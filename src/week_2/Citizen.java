package week_2;

public class Citizen extends Customer{


    Citizen(String customerName) {
        super(customerName);
        super.hatchbackCar = new HatchbackCar();
    }

    Citizen(String customerName, HatchbackCar hatchbackCar) {
        super(customerName, hatchbackCar);

    }

    public void rentAHatchbackCar() {
        this.hatchbackCar.rentACar();
    }


}
