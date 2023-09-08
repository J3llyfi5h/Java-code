import java.util.Scanner;
import java.util.Random;

public class MQ {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\tWelcome Please answer the following questions:");
        Random rand = new Random();
        
        int[] x = new int[5];
        int[] y = new int[5];
        double[]q = new double[5];
        for(int i=0; i<5;i++)
        {
        x[i] =  rand.nextInt(20)+1;
        y[i] =  rand.nextInt(20)+1;
        }
        q[0] = x[0] + y[0];
        q[1] = x[1] - y[1];
        q[2] = x[2] / (double)y[2];
        q[2] = Math.round(q[2] * 100.0)/100.0;
        q[3] = x[3] * y[3];
        q[4] = x[4] / (double)y[4];
        q[4] = Math.round(q[4] * 100.0)/100.0;
        int correct = 0;
        int count=5;

        System.out.print("\tQuestion 1: What is "+ x[0] + " + " + y[0] + " ? Enter: ");
            int Sum = keyboard.nextInt();
            if (Sum == q[0]) 
            {
                correct++;
            }
            else 
            {
                System.out.print(" ");       
            }
        System.out.print("\tQuestion 2: What is "+ x[1] + " - " + y[1] + " ? Enter: ");
            int Minus = keyboard.nextInt();
            if (Minus == q[1])
            {
                correct++;
            }
            else
            {
                System.out.print(" ");
            }
        System.out.print("\tQuestion 3: What is " + x[2] + " / " + y[2] + " ? Enter: ");
            double Div = keyboard.nextDouble();
            if (Div == q[2]) 
            {
                correct++;
            }
            else 
            {
                System.out.print(" ");       
            }
        System.out.print("\tQuestion 4: what is " + x[3] + " * " + y[3] + " ? Enter: ");
            int  Mul = keyboard.nextInt();
            if (Mul == q[3]) 
            {
                correct++;
            }
            else 
            {
                System.out.print(" ");       
            }
            System.out.print("\tQuestion 5: What is "+ x[4] + " / " + y[4] + " ? Enter: ");
            double div = keyboard.nextDouble();
            if (div == q[4])
            {
                correct++;
            }
            else
            {
                System.out.print(" ");
            }

        
            System.out.println();
        System.out.println("\tYou got "+correct+" correct answers out of "+count+". The detail is below: ");
        
        System.out.print("\tQuestion 1: What is "+ x[0] + " + " + y[0]+ " = "+Sum);
            if (Sum == q[0]) 
            {
                System.out.println("\tCorrect! ");
            }
            else 
            {
                System.out.println("\tWrong! The correct answer is : " + q[0]);
            }
        System.out.print("\tQuestion 2: What is "+ x[1] + " - " + y[1]+" = "+Mul);
            if (Minus == q[1]) 
            {
                System.out.println("\tCorrect!");
            }
            else
            {
                System.out.println("\tWrong! The correct answer is : " +q[1]);
            }

        System.out.print("\tQuestion 3: What is " + x[2] + " / " + y[2]+" = "+Div);
            if (Div == q[2]) 
            {
                System.out.println("\tCorrect!");
            }
            else
            {
                System.out.println("\tWrong! The correct answer is : " +q[2]);
            }

        System.out.print("\tQuestion 4: what is " + x[3] + " * " + y[3]+" = "+Minus);
            if (Mul == q[3]) 
            {
                System.out.println("\tCorrect!");
            }
            else
            {
                System.out.println("\tWrong! The correct answer is : "+q[3]);
            }        
        System.out.print("\tQuestion 5: What is " + x[4] + " / " + y[4]+" = "+div);
            if (div == q[4]) 
            {
                System.out.println("\tCorrect!");
            }
            else
            {
                System.out.println("\tWrong! The correct answer is : " +q[2]);
            }

    }
}