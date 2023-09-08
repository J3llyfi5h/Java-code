public class SecondLargestNumber {

    public static int secondLargest(int[][] array2D) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] > largest) {
                    secondLargest = largest;
                    largest = array2D[i][j];
                } else if (array2D[i][j] > secondLargest && array2D[i][j] != largest) {
                    secondLargest = array2D[i][j];
                }
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[][] array2D = {
            {17, 74, 33, 86},
            {46, 34, 90},};
        int secondLargest = secondLargest(array2D);
        System.out.print("The second largest number is [" + secondLargest + "].");
    }
}
