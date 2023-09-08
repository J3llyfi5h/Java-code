public class RadomNumberToAlphabet
{
    public static void main(String[] args)
    {
        int row,column;
        char[][] letters = new char [10][10];
        for( row = 0; row<letters.length; row++)
        {
            for (column = 0; column<letters[row].length; column++)
            {
                int number = (int)(Math.random()* 26)+65;
                letters[row][column] = (char)number;
                System.out.print(letters[row][column] + " ");
            }
            System.out.println();
        }
    }
}