import java.util.Scanner;

public class NumberToLetters {

    public static void verbose(long inputNumber){
        
        int i=9;
        boolean check=true;
        boolean frontCheck=false;
        boolean midCheck=false;
        StringBuilder word=new StringBuilder();
        
        // Declare string array and assign data to store form index 0-19
        String number[] = {
            "", " one", " two", " three", " four", " five",
            " six", " seven", " eight", " nine", " ten",
            " eleven", " twelve", " thirteen", " fourteen",
            " fifteen", " sixteen", " seventeen eighteen",
            " nineteen"
        };
        
        // Decalrre string array and assign data to store from index 0-9
        String numberDecimal[] = {
            "", " ten", " twenty", " thirty", " forty",
            " fifty", " sixty", " seventy", " eighty",
            " ninety"
        };
        
        do{
            int remainNumber=(int) (inputNumber/Math.pow(10, i));
            switch(i){
                case 8:{
                    if(remainNumber!=0){
                    word.append(number[remainNumber]+" Hundreds");
                    frontCheck=true;
                    }
                    break;
                }
                case 7:{
                    if(remainNumber==1){
                        i--;
                        continue;
                    }
                    else if(remainNumber!=0){
                        word.append(numberDecimal[remainNumber]);
                        frontCheck=true;
                    }
                    break;
                }
                case 6:{
                    if(!frontCheck){
                        // do nothing
                    }
                    else if(remainNumber==0){
                        word.append(" Millions and ");
                    }
                    else if(remainNumber<10){
                        word.append("-"+number[remainNumber]+" Millions and ");
                        
                    }else{
                        word.append(number[remainNumber]+" Millions and ");
                        
                    }
                    break;
                }
                case 5:{
                    if(remainNumber!=0){
                    word.append(number[remainNumber]+" Hundreds");
                    midCheck=true;
                    }
                    break;
                }
                case 4:{
                    if(remainNumber==1){
                        i--;
                        continue;
                    }
                    else if(remainNumber!=0){
                        word.append(numberDecimal[remainNumber]);
                        midCheck=true;
                    }
                    break;
                }
                case 3:{
                    if(!midCheck){
                        // do nothing
                    }
                    else if(remainNumber==0){
                        word.append(" Thousands and ");
                    }
                    else if(remainNumber<10){
                        word.append("-"+number[remainNumber]+" Thousands and");
                    }else{
                        word.append(number[remainNumber]+" Thousands and");
                    }
                    break;
                }
                case 2:{
                    if(remainNumber!=0){
                    word.append(number[remainNumber]+" Hundreds");
                    }
                    break;
                }
                case 1:{
                    if(remainNumber==1){
                        i--;
                        continue;
                    }
                    else if(remainNumber!=0){
                        word.append(numberDecimal[remainNumber]);
                    }
                    break;
                }
                case 0:{
                    if(remainNumber<10){
                        
                        word.append("-"+number[remainNumber]+".");
                        check=false;
                    }else{
                        word.append(number[remainNumber]+".");
                        check=false;
                    }
                    break;
                } 
            } 
            inputNumber=(long) (inputNumber%Math.pow(10, i));
            i--;
        }while(check);
        System.out.println("This Number in English: "+word.toString());  
    }
    public static void main(String args[]) {
        String word;
        long num;
        Scanner cin=new Scanner(System.in);
        
        do {

            System.out.print("Input Number(0-10^9):");
            num = cin.nextInt();
            
            // Check if user actually input number inside this range or not
        } while (!(num >= 0 && num < Math.pow(10, 9)));
        verbose(num);
        
    }
}
