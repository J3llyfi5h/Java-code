package multiarray;

public class X2 {

    public static void main(String args[]) {
        String array2[][] = {
            {"A[0][0]", "A[0][1]", "A[0][2]", "A[0][3]"},
            {"A[1][0]", "A[1][1]", "A[1][2]", "A[1][3]"},
            {"A[2][0]", "A[2][1]", "A[2][2]", "A[2][3]"},
            {"A[3][0]", "A[3][1]", "A[3][2]", "A[3][3]"}
        };

        int length = array2.length;
        // count all line will run through our array
        int diagonalLines = (length + length) - 1;
        // find the middle line < the longest one >
        int midPoint = (diagonalLines / 2) + 1;
        int itemsInDiagonal = 0;

        for (int i = 1; i <= diagonalLines; i++) {
            int rowIndex;
            int columnIndex;

            // infront of midpoint
            if (i <= midPoint) {
                itemsInDiagonal++;
                for (int j = 0; j < itemsInDiagonal; j++) {
                    rowIndex = (i - j) - 1;
                    columnIndex = j;
                    System.out.print("\t" + array2[rowIndex][columnIndex]);

                }
                System.out.println("");
            }
            // behind of midpoint
            else {
                itemsInDiagonal--;
                for (int j = 0; j < itemsInDiagonal; j++) {
                    rowIndex = (length - 1) - j;
                    columnIndex = (i - length) + j;
                    System.out.print("\t" + array2[rowIndex][columnIndex]);
                }
                System.out.println("");
            }
        }

    }
}
