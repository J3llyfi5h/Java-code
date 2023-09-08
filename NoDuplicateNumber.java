
import java.util.Scanner;
import java.util.ArrayList;

public class NoDuplicateNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> newList = new ArrayList<>();
        System.out.println("Input Value and Press 0 to display : ");
        int number = sc.nextInt();
        while (number != 0) {
            // check if it duplicate or not
            if (!newList.contains(number)) {
                newList.add(number);
            }
            number = sc.nextInt();
        }
        sc.close();
        System.out.print("List with no duplicate Value " + newList);
    }
}