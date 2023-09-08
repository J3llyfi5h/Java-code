import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        
        int computer_num = 50;
        int numTry = 0;
        
        Scanner input = new Scanner (System.in);
        int guess;
        boolean check = false;
        
        do{
        System.out.println("Guess a number : ");
        guess = input.nextInt();
        numTry++;
        
        if (guess == computer_num){
            System.out.println("Well done you took[" + guess +"] attend");
        System.out.println("Your guess is " + numTry +" time.");
        check = true;
        }
        else if (guess < computer_num){
            System.out.println("Your guess is too low");
        }
        else if (guess > computer_num)
        {
            System.out.println("Your guess is too high");
        }
        } while(!check);
    }
}