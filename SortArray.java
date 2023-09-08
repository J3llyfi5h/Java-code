
import java.util.Scanner;

public class SortArray {

    public static String sort(String s) {

        // store all character inside temp 
        char tempArray[] = s.toCharArray();
        // bubble sort
        for (int i = 0; i < tempArray.length - 1; i++) {
            for (int j = i + 1; j < tempArray.length; j++) {
                // convert to lower all for easy compare
                if (Character.toLowerCase(tempArray[i]) > Character.toLowerCase(tempArray[j])){
                    //swap if j smaller than i
                    char temp;
                    temp = tempArray[i];
                    tempArray[i] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }
        //build new string into newString
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < tempArray.length; i++) {
            newString.append(tempArray[i]);
        }

        return newString.toString();
    }

    public static void main(String[] args) {
        String inputString;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Word: ");
        inputString = input.next();

        System.out.println("Output : " + sort(inputString));
    }
}
