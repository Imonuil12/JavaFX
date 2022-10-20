package Week4;

import java.util.Scanner;

public class Decimal2Binary {
        public static void main(String[] args) {
            // you may modify the code below, but try to preserve the program structure
            int decimalNumber;
            Scanner console = new Scanner(System.in);
            System.out.print("Enter an integer number: ");
            decimalNumber = console.nextInt();

            System.out.printf("Binary of %d is %d", decimalNumber, decimalToBinary(decimalNumber));
        }

        private static int decimalToBinary(int decimalNumber) {
            // add your code below that implements the logic of the problem instructions.
            int decimalNumber = 0;
            while (binaryNumber != 0){
                int lengthOfNumber = String.valueOf(binaryNumber).length;
                decimalNumber += Math.pow(2, lengthOfNumber - 1);
                binaryNumber -= Math.pow(10, lengthOfNumber - 1);
            }
            return binaryNumber;
        }
}

