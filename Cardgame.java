import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Cardgame {
    public static void main(String[] args) 
    {
        ArrayList<String> deck = new ArrayList<>();
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};
        String[] ranks = {"A", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "J", "Q", "K"};

        ArrayList<String> playerUser = new ArrayList<>();
        ArrayList<String> playerComputer = new ArrayList<>();
        
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < 4; j++) {
                deck.add(ranks[i] + " " + suits[j]);
            }
        }
        for (int i = 0; i < 5; i++) {      // Shuffle 5 times
            Collections.shuffle(deck);
        }
        playerUser.add(deck.get(0)); //addy card to player 
        playerComputer.add(deck.get(1)); //add card to computer
        playerUser.add(deck.get(2));
        playerComputer.add(deck.get(3));

        for (int i = 0; i < playerComputer.size() + playerUser.size(); i++) {
            deck.remove(i);
        }
        int playerTotal = sum(playerUser); //total player's points
        int computerTotal = sum(playerComputer); //total computer's points

        System.out.println("Your Card: " + playerUser + " Total points: " + playerTotal); //show the cards in player's hand
        if (computerTotal == playerTotal) {
            System.out.println("Draw!"); //If player and computer have the same card it'll draw!
            return;
        }
        if (playerTotal == 8 || playerTotal == 9) {
            System.out.println("You wins!"); //player wins
            return;
        } else if (computerTotal == 8 || computerTotal == 9) {
            System.out.println("Computer card: " + playerComputer + " Total points: " + computerTotal); //show the computer's card
            System.out.println("Computer wins!"); // computer wins
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to draw another card? (y/n)");//if no one boom 
        String input = scanner.nextLine(); 
             scanner.close();

        if (input.equals("y")) {
            playerUser.add(deck.get(4)); //add card to the player if they input "y"
            playerTotal = sum(playerUser);

            System.out.println("Your card: " + playerUser + " Total points: " + playerTotal); //display player's card
        }
        Random rand = new Random();
        // add card for computer base on conditon 
        if (computerTotal < 4 && rand.nextDouble() < 0.8) { //if total < 4 80% computer add another card
            playerComputer.add(deck.get(5));
            computerTotal = sum(playerComputer);
            System.out.println("Computer card: " + playerComputer + " Total points: " + computerTotal);

        } else if (computerTotal == 5 && rand.nextDouble() < 0.4) {
            playerComputer.add(deck.get(6));
            computerTotal = sum(playerComputer);
            System.out.println("Computer card: " + playerComputer + " Total points: " + computerTotal);

        } else if (computerTotal == 6 && rand.nextDouble() < 0.1) {
            playerComputer.add(deck.get(7));
            computerTotal = sum(playerComputer);
            System.out.println("Computer card: " + playerComputer + " Total points: " + computerTotal);
        }
        //find the winner base on points
        if (playerTotal > computerTotal) {
            System.out.println("You wins!");
        } else if (computerTotal > playerTotal) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Draw!");
        }
    }

    //to calculate the point
    public static int sum(List<String> cards) {
        int totalPoints = 0;

        for (String card : cards) {

            String rank=card.split(" ")[0];
      
         if(rank.equals ("A"))
        {//A will equal 1
            totalPoints=totalPoints+1;
             
        }else if(rank.equals ("J")||rank.equals ("Q")||rank.equals ("K")){//royal cards are got no point
            totalPoints=totalPoints+0;
             
        }else
        {
            totalPoints+=Integer.parseInt(rank); 
        }
            //to make the point less than 2 digits
            if (totalPoints >= 10) {
                totalPoints = totalPoints-10;
            } else if (totalPoints >= 20) {
                totalPoints = totalPoints- 20;
            }

        }

        return totalPoints;

    }
}
