import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static int sumOfNumbers(int[] array) {
        int lengthOfArray = array.length;
        int[] newArray = new int[lengthOfArray - 1];

        for (int i = 1; i < lengthOfArray; i++) {
            newArray[i - 1] = array[i];
        }

        if (lengthOfArray == 1) {
            return array[0];
        }
        else {
            return array[0] + sumOfNumbers(newArray);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements in the array: ");
        int sizeOfList = sc.nextInt();

        if (sizeOfList == 0) {
            System.out.println("Sum of [0] = 0");
        }
        else {
            System.out.println("Start typing the elements in array: ");
            int[] arrayOfNumbers = new int[sizeOfList];

            for (int i = 0; i < sizeOfList; i++) {
                arrayOfNumbers[i] = sc.nextInt();
            }

            System.out.println("Sum of " + Arrays.toString(arrayOfNumbers) + " = " + sumOfNumbers(arrayOfNumbers));
        }
    }
}
