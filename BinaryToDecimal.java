import java.util.Scanner;
public class BinaryToDecimal {

    // function for converting binary to decimal 
    static Double binaryToDecimal(double binaryNumber) {
        int num = (int) binaryNumber;
        String number[] = Double.toString(binaryNumber).split("\\.");
        StringBuilder decimalBuilder = new StringBuilder();

        // Initializing base value to 1, i.e 2^0
        int base = 1;

        // part integer
        int dec_value = 0;
        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
            dec_value = dec_value + last_digit * base;
            base = base * 2;
        }
        decimalBuilder.append(String.valueOf(dec_value));

        // part floating-point
        if ((binaryNumber - num) != 0.0) {
            decimalBuilder.append(".");
            double result = 0;
            for (int i = 0; i < number[1].length(); i++) {
                result = result + ((double) number[1].charAt(i) / Math.pow(2, (i + 1)));
            }

            // split again becuase we just append the behind (.) part
            String finalResult[] = String.valueOf(result).split("\\.");
            decimalBuilder.append(finalResult[1]);
        }

        return Double.parseDouble(decimalBuilder.toString());
    }

    // function for converting decimal to hex
    private static String findHex(double number) {
        StringBuilder hexBuilder = new StringBuilder();
        int numIntegral = (int) number;
        int remain;
        // minus to get the remain number behind dot(.) 
        double numFractional = number - numIntegral;

        // binary conversion for the integral part
        String hex = "";
        char hexchars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (numIntegral > 0) {
            remain = numIntegral % 16;
            hex = hexchars[remain] + hex;
            numIntegral = numIntegral / 16;
        }

        hexBuilder.append(hex);

        // binary conversion for the fractional part
        if (numFractional != 0) {
            hexBuilder.append(".");

            while (numFractional != 0) {
                numFractional *= 16;
                hexBuilder.append(hexchars[(int) numFractional]);
                numFractional = numFractional - (int) numFractional;
            }
        }

        return hexBuilder.toString();
    }

    public static void main(String args[]) {
        double number;
        Scanner cin = new Scanner(System.in);
        System.out.print("Input Binary Number: ");
        number = cin.nextDouble();
        System.out.println("Decimal: " + findHex(binaryToDecimal(number)));
        cin.close();
    }
}
