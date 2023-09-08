package multiarray;

public class X4 {

    public static void main(String args[]) {

        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {3, 1}, {4, 1}};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i][1] > array[j][1]) {
                    int temp[];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } else if (array[i][1] == array[j][1]) {
                    if (array[i][0] > array[j][0]) {
                        int temp[];
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ",");
            }
            System.out.print("\b");
            System.out.println("");
        }

    }
}
