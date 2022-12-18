import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize = 0;

        System.out.print("Size of the array : ");
        arraySize = input.nextInt();

        int[] list = new int[arraySize];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter " + (i + 1) + ". element of array : ");
            list[i] = input.nextInt();
        }

        System.out.print("Sorting from smallest to largest : ");
        Arrays.sort(list);

        for (int item : list){
            System.out.print(item + " ");
        }


    }
}
