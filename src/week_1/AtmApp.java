package week_1;
import  java.util.Scanner;
public class AtmApp {
    float userMoney;

    public  AtmApp() {
        this.userMoney = 0;
    }

    public AtmApp(float startingMoney) {
        this.userMoney = startingMoney;
    }



    public void open() {
        System.out.println("-----------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Dream Bank!");
        boolean isAtmActive = true;
        float money;

        while (isAtmActive) {

            System.out.print("Please type to deposit: '1', to withdraw: '2', to learn your money: '3', to exit: '4': ");
            int key = input.nextInt();

            switch (key) {
                case 1:
                    System.out.println("Please enter your money: ");
                    money = input.nextFloat();
                    this.deposit(money);
                    this.showResiduary();
                    continue;
                case 2:
                    System.out.println("Please enter your money: ");
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
        System.out.println("You have $" + this.userMoney);
    }

    private boolean withdraw(float money) {
        if (money <= this.userMoney) {
            this.userMoney -= money;
            System.out.println("Your process is successfully completed.");
            return true;
        } else {
            System.out.println("You entered wrong value.");
            return false;
        }
    }

    private boolean deposit(float money) {
        if(money > 0) {
            this.userMoney += money;
            System.out.println("Your process is successfully completed.");
            return true;
        } else {
            System.out.println("You entered wrong value.");
            return false;
        }
    }
    }
