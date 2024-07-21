import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static int binarySearch(String[] myList, String naimForSearch) {
        int low = 0;
        int high = myList.length - 1;
        int mid = 0;
        String guess = myList[mid];

        while (low <= high) {
            mid = (low + high) / 2;
            guess = myList[mid];

            if (naimForSearch.compareToIgnoreCase(guess) == 0) {
                return mid;
            }
            else if (naimForSearch.compareToIgnoreCase(guess) > 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Lada", "Audi"};

        Arrays.sort(cars);

        System.out.println("Enter a name of car please: ");
        Scanner in = new Scanner(System.in);
        String nameForSearch = in.next();

        System.out.println(binarySearch(cars, nameForSearch));

    }
}
