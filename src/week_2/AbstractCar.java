package week_2;

public abstract class AbstractCar {

    private int luggageSize;
    private int priceOfRent;
    private int ageOfCar;
    private String color;

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


    public abstract double calculateRentPrice(int day, int priceOfRent);



    public void rentACar() {
        this.rentACar(1);
    }
    public void rentACar(int day) {
        if(day <= 0) {
            System.out.println("You entered wrong value for day...");
        }else {
            System.out.println("The car is hired for " + day + (day == 1 ? " day" : " days"));
            System.out.println("The price of rent is $" + calculateRentPrice(day, getPriceOfRent()));
        }
    }
}
