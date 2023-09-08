import java.util.Scanner;
public class StudentScore {
  public static void main(String[] args) {
    int[][][] score = new int[1][8][3];
    int total;
    int sumTotal1 = 0;
    int sumTotal2 = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Input your students score :");
    System.out.println("\t  Maths\tphysics\tchemistry");
    for(int side = 0 ; side < 1 ; side++){
      
      for(int row = 0 ; row < 8; row++){
        System.out.print("Students #"+ (row+1)+": ");
        for(int column = 0 ;column<3;column++){
          //input value to score
          score[side][row][column] = input.nextInt();
        }
      }
    }
    System.out.println("Group 1:");
    System.out.println("----------------------------------------------------------");
    System.out.println("Name\t\tMaths\tPhysics\tChemistry\tTotal");
    System.out.println("----------------------------------------------------------");
    for(int side = 0 ; side < 1 ; side++){
      
      for(int row = 0 ; row < 4; row++){
        System.out.printf("Students "+(row+1));
        total = 0;
        for(int column=0;column<3;column++){
          //calculate sum of score of each students
          total += score[side][row][column];
          System.out.printf("%9d",score[side][row][column]);
        }
        //find totalScore 
        sumTotal1 += total;
        System.out.printf("%15d",total);
        System.out.println("");
      }
    } 
    System.out.println("----------------------------------------------------------");
    System.out.printf("\t\t\t\tTotal Score : %7d\n",sumTotal1);
    System.out.println("Group 2:");
    System.out.println("----------------------------------------------------------");
    System.out.println("Name\t\tMaths\tPhysics\tChemistry\tTotal");
    System.out.println("----------------------------------------------------------");
    for(int side = 0 ; side < 1 ; side++){
      
      for(int row = 4 ; row < 8; row++){
        System.out.printf("Students "+(row+1));
        total = 0;
        for(int column=0;column<3;column++){
          
          total += score[side][row][column];
          System.out.printf("%9d",score[side][row][column]);
          
        }
        sumTotal2 += total;
        System.out.printf("%15d",total);
        System.out.println("");
      }
    } 
    System.out.println("----------------------------------------------------------");
    System.out.printf("\t\t\t\tTotal Score : %7d\n",sumTotal2);
  }
}  