package week_3.GreengrocerApp;

public class Boss extends Person{

    // Manav dükkanının bir nesnesi
    public GreengrocerMarket greengrocerMarket;


    // Patron bilgilerinin eklenildiği Constructor
    public Boss(String name, String surname){
        super(name, surname);
        this.greengrocerMarket = new GreengrocerMarket();
    }

}
