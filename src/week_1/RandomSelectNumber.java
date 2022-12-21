package week_1;
import java.util.Random;

public class RandomSelectNumber {
    int number;
    int count;

    public RandomSelectNumber() {
        this.count = 0;
        this.number = 0;
    }

    public void run() {
        // The program will run on this method
        System.out.println("-----------------------------------");

        boolean isActive = true;
        while (isActive) {

            this.createNewNumber();
            this.increaseCount();
            if (this.number >= 50 && this.number <= 100) {
                System.out.println("We successfully finished this job.");
                System.out.println("The number is: " + this.number + ", the count is: " + this.count);
                isActive = false;
            }
        }
        System.out.println("-----------------------------------");
    }


    private void createNewNumber() {
        // To create new random number

        Random random = new Random();
        this.number = random.nextInt( 500);
    }
    private void increaseCount() {
        // To increase count variable.
        this.count++;
    }
}
