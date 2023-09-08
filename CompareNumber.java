import java.util.Scanner;

public class CompareNumber
{
    public static void main(String[] args)
    {
    int x;
    int y;
    char compare;
        //used to take the input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        x = sc.nextInt();//reads the input
        do
        {
        System.out.println("Enter numbers:");
        y = sc.nextInt();//reads the input
        
        x = x +y;
        System.out.println("Sum is " + x);
        System.out.println("Enter y to add another number");
            compare = sc.next().charAt(0);
        }
        while(compare == 'y'||compare == 'Y');
        System.out.println("Your Total is =" + x);
    }
}