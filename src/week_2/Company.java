package week_2;

// This class created for companies to rent all car
public class Company extends Customer{

    // The constructor methods
    Company(String customerName) {
        super(customerName);
        super.hatchbackCar = new HatchbackCar();
        super.sedanCar = new SedanCar();
        super.suvCar = new SuvCar();
    }
    Company(String customerName, HatchbackCar hatchbackCar, SuvCar suvCar, SedanCar sedanCar) {
        super(customerName, hatchbackCar, suvCar, sedanCar);
    }

    // This method rent a sedan type car to company for a day
    public void rentASedanCarForADay(){
        super.sedanCar.rentACar(super.customerName);
    }
    // This method rent a sedan type car to company for a month
    public void rentASedanCarForAMonth(){
        super.sedanCar.rentACarForAMonth(super.customerName);
    }

    // This method rent a suv type car to company for a day
    public void rentASuvCarForADay(){
        super.suvCar.rentACar(super.customerName);
    }

    // This method rent a suv type car to company for a month
    public void rentASuvCarForAMonth(){
        super.suvCar.rentACarForAMonth(super.customerName);
    }

    // This method rent a hatchback type car to company for a day
    public void rentAHatchbackCarForADay(){
        super.hatchbackCar.rentACar(super.customerName);
    }

}
