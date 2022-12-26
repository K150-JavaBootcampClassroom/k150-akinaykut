package week_2;

// Abstract Class For All Car
public abstract class AbstractCar {

    // The variables of cars
    private int luggageSize;
    private int priceOfRent;
    private int ageOfCar;
    private String color;

    // The getters and setters methods of variables
    public int getLuggageSize() {
        return luggageSize;
    }

    public void setLuggageSize(int luggageSize) {
        this.luggageSize = luggageSize;
    }

    public int getPriceOfRent() {
        return priceOfRent;
    }

    public void setPriceOfRent(int priceOfRent) {
        this.priceOfRent = priceOfRent;
    }

    public int getAgeOfCar() {
        return ageOfCar;
    }

    public void setAgeOfCar(int ageOfCar) {
        this.ageOfCar = ageOfCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // The constructor methods for abstract class
    AbstractCar(){
        this.luggageSize = 10;
        this.priceOfRent = 100;
        this.ageOfCar = 1;
        this.color = "Black";
    }
    AbstractCar(int luggageSize, int priceOfRent, int ageOfCar, String color) {
        this.luggageSize = luggageSize;
        this.priceOfRent = priceOfRent;
        this.ageOfCar = ageOfCar;
        this.color = color;
    }


    // The method does calculate rent price
    public abstract double calculateRentPrice(int day, int priceOfRent);



    // The method does rent a car for a day
    public void rentACar() {
        this.rentACar(1);
    }

    public void rentACar(String customerName) {
        this.rentACar(1, customerName);
    }

    // The method does rent a car for count of variable day and stdout screen the information
    public void rentACar(int day) {
        if(day <= 0) {
            System.out.println("You entered wrong value for day...");
        }else {
            System.out.println("The car is hired for " + day + (day == 1 ? " day" : " days") );
            System.out.println("The price of rent is $" + calculateRentPrice(day, getPriceOfRent()));
        }
    }

    // The method does rent a car for count of variable day and stdout screen the information
    public void rentACar(int day, String customerName) {
        if(day <= 0) {
            System.out.println("You entered wrong value for day...");
        }else {
            System.out.println("The car is hired by " + customerName + " for " + day + (day == 1 ? " day" : " days") );
            System.out.println("The price of rent is $" + calculateRentPrice(day, getPriceOfRent()));
        }
    }
}
