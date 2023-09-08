import java.util.Scanner;
import java.util.Random;

public class NewClass {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome Please answer the following questions:");
        Random rand = new Random();
        
        int[] x =new int[4];
        int[] y = new int[4];
        int[]q = new int[4];
        for(int i=0; i<4;i++)
        {
        x[i] =  rand.nextInt(20)+1;
        y[i] =  rand.nextInt(20)+1;
        }
        q[0] = x[0] + y[0];
        q[1] = x[1] * y[1];
        q[2] = x[2] / y[2];
        q[3] = x[3] - y[3];
        int correct = 0;
        int count=5;

        System.out.print("Question 1: What is "+ x[0] + " + " + y[0] + " ? Enter: ");
            int Sum = keyboard.nextInt();
            if (Sum == x[0] + y[0]) 
            {
                correct++;
            }
            else 
            {
                System.out.print(" ");       
            }
        System.out.print("Question 2: What is "+ x[1] + " * " + y[1] + " ? Enter: ");
            int Mul = keyboard.nextInt();
            if (Mul == x[1] * y[1])
            {
                correct++;
            }
            else
            {
                System.out.print(" ");
            }
        System.out.print("Question 3: What is " + x[2] + " / " + y[2] + " ? Enter: ");
            int Div = keyboard.nextInt();
            if (Div == x[2] / y[2]) 
            {
                correct++;
            }
            else 
            {
                System.out.print(" ");       
            }

        System.out.print("Question 4: what is " + x[3] + " - " + y[3] + " ? Enter: ");
            int  Minus = keyboard.nextInt();
            if (Minus == x[3] - y[3]) 
            {
                correct++;
            }
            else 
            {
                System.out.print(" ");       
            }
        
            System.out.println();
        System.out.println("You got "+correct+" correct answers out of "+count+". The detail is below: ");
        
        System.out.print("Question 1: What is "+ x[0] + " + " + y[0]+ " = "+Sum);
            if (Sum == x[0] + y[0]) 
            {
                System.out.println("   Correct!  ");
                correct++;
            }
            else 
            {
                System.out.println("   Wrong! The correct answer is : " + q[0]);
            }
        System.out.print("Question 2: What is "+ x[1] + " * " + y[1]+" = "+Mul);
            if (Mul == x[1] * y[1]) 
            {
                System.out.println("   Correct! ");
                correct++;
            }
            else
            {
                System.out.println("   Wrong! The correct answer is : " +q[1]);
            }

        System.out.print("Question 3: What is " + x[2] + " / " + y[2]+" = "+Div);
            if (Div == x[2] / y[2]) 
            {
                System.out.println("   Correct  !");
                correct++;
            }
            else
            {
                System.out.println("   Wrong! The correct answer is : " +q[2]);
            }

        System.out.print("Question 4: what is " + x[3] + " - " + y[3]+" = "+Minus);
            if (Minus == x[3] - y[3]) 
            {
                System.out.println("   Correct!  ");
                correct++;
            }
            else
            {
                System.out.println("   Wrong! The correct answer is : "+q[3]);
            }        
    }
}