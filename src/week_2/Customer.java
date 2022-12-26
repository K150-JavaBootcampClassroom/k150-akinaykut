package week_2;

// This abstract class created for different customers
public abstract class Customer{

    // The variable of customer class
    String customerName;
    SedanCar sedanCar;
    SuvCar suvCar;
    HatchbackCar hatchbackCar;

    // The constructor methods
    Customer(String customerName){
        this.customerName = customerName;
    }

    Customer(String customerName, HatchbackCar hatchbackCar) {
        this(customerName);
        this.hatchbackCar = hatchbackCar;
    }

    Customer(String customerName, HatchbackCar hatchbackCar, SuvCar suvCar, SedanCar sedanCar) {
        this(customerName);
        this.hatchbackCar = hatchbackCar;
        this.suvCar = suvCar;
        this.sedanCar = sedanCar;
    }

}
