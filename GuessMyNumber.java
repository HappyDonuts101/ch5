import java.util.Random;
import java.util.Scanner;

public class nini {

    public static void main(String[] args) {
        // pick a random number
        int userNumber;
        int difference;
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?" );
        System.out.print("Type a number: " );
        userNumber = in.nextInt();
        System.out.println("Your guess is: " + userNumber);
        difference = (userNumber-number);

        if(difference==0) {
            System.out.println("Congrats! You got it");
            return;
        }
        else if(difference>0) {

            System.out.println("Your guess was too high");
            
        } else {

            System.out.println("Your guess was too low");
        }
        System.out.print("Type a number: " );
        userNumber = in.nextInt();
        System.out.println("Your guess is: " + userNumber);
        difference = (userNumber-number);

        if(difference==0) {
            System.out.println("Congrats! You got it");
            return;
        }
        else if(difference>0) {

            System.out.println("Your guess was too high");
            
        } else {

            System.out.println("Your guess was too low");
        }
                

        System.out.print("Type a number: " );
        userNumber = in.nextInt();
        System.out.println("Your guess is: " + userNumber);
        difference = (userNumber-number);

        if(difference==0) {
            System.out.println("Congrats! You got it");
            return;
        }
        else if(difference>0) {

            System.out.println("Your guess was too high");
            
        } else {

            System.out.println("Your guess was too low");
        }

        System.out.println("Out of guesses mimimimimimi!");
                
        
        
    }
}