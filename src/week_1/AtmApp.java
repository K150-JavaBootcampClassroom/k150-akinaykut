package week_1;
import  java.util.Scanner;
public class AtmApp {
    float userMoney;

    public  AtmApp() {
        // If object created without value
        this.userMoney = 0;
    }

    public AtmApp(float startingMoney) {
        // If object created with value
        this.userMoney = startingMoney;
    }



    public void open() {
        // The program will run on this method.
        System.out.println("-----------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Dream Bank!");

        // This variable using on while loop.
        boolean isAtmActive = true;
        // This variable to get value from user.
        float money;

        while (isAtmActive) {

            System.out.print("Please type to deposit: '1', to withdraw: '2', to learn your money: '3', to exit: '4': ");

            // This variable working on switch case to get user choose.
            int key = input.nextInt();

            switch (key) {
                case 1:
                    System.out.println("Please enter your deposit money: ");
                    money = input.nextFloat();
                    this.deposit(money);
                    this.showResiduary();
                    continue;
                case 2:
                    System.out.println("Please enter your withdraw money: ");
                    money = input.nextFloat();
                    this.withdraw(money);
                    this.showResiduary();
                    continue;
                case 3:
                    this.showResiduary();
                    continue;
                case 4:
                    System.out.println("Atm is closing...");
                    isAtmActive = false;
                    break;
                default:
                    System.out.println("You entered wrong value.");
                    break;
            }
            System.out.println("-----------------------------------");
    }

}

    private void showResiduary() {
        // To show user money.
        System.out.println("You have $" + this.userMoney);
    }

    private void withdraw(float money) {
        // To withdraw user money.
        if (money <= this.userMoney && money > 0) {
            this.userMoney -= money;
            System.out.println("Your process is successfully completed.");

        } else {
            System.out.println("You entered wrong value.");

        }


    }

    private void deposit(float money){
        // To deposit user money.
        if (money > 0) {
            this.userMoney += money;
            System.out.println("Your process is successfully completed.");

        } else {
            System.out.println("You entered wrong value.");

        }
    }


}
