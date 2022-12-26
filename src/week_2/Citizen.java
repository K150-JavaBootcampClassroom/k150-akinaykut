package week_2;

// This class created for citizens to rent a car
public class Citizen extends Customer{

    // The constructor methods
    Citizen(String customerName) {
        super(customerName);
        super.hatchbackCar = new HatchbackCar();
    }

    Citizen(String customerName, HatchbackCar hatchbackCar) {
        super(customerName, hatchbackCar);

    }

    // This method rent a car for citizen only one day.
    public void rentAHatchbackCarForADay() {
        super.hatchbackCar.rentACar(super.customerName);
    }

    // The citizens cannot rent a vehicle other than the hatchback type

}
