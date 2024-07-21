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
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of objects in the list please: ");
        int sizeOfList = sc.nextInt();

        System.out.println("Start typing the name of the object: ");
        String[] myList = new String[sizeOfList];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < sizeOfList; i++) {
            myList[i] = in.next();
        }

        Arrays.sort(myList);

        System.out.println("Please enter the name of the object that you want to find in the list: ");
        String nameForSearch = in.next();

        System.out.println(binarySearch(myList, nameForSearch));
    }
}
