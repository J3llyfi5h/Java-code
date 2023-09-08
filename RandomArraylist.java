import java.util.ArrayList;

public class Arraylist4  {

    public static void main(String[] args) {
        ArrayList<Integer> listValue = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // random number from 1-10
            int random_number = 1 + (int) (Math.random() * 10);
            listValue.add(random_number);
        }
        System.out.println("Random ArrayList : " + listValue);
        System.out.print("The missing number is: ");
        for (int i = 1; i <= 10; i++) {
            //check if it contain that number or not
            if (!listValue.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
