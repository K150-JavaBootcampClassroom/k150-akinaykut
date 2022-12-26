package week_2;

public abstract class Customer{
    String customerName;
    SedanCar sedanCar;
    SuvCar suvCar;
    HatchbackCar hatchbackCar;

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
