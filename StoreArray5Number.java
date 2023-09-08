import java.util.Scanner;
public class StoreArray5Number  {
    public static void main(String[] args)
    {
        //Declare variable and create an array
        int [] Number = new int[5]; 
        int i;
        //Input and store 5 numbers in the array
        for(i = 0; i < 5; i++)
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        Number[i] = sc.nextInt();
        }
        //Output
        System.out.println("The last number you entered was a ["+Number[4]+"]");
        }
}
