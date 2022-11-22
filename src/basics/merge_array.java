package basics;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class merge_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size, size2, ass;
        System.out.println("Enter the 1st size of array");
        size = scanner.nextInt();

        int[] arr1 = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("enter the size of 2nd array");
        size2 = scanner.nextInt();

        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of 2nd array");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = scanner.nextInt();
        }

        int length = arr1.length + arr2.length;
        int[] arr3 = new int[length];

        //loop to store the elements of first araay into resultant array
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);

        //loop to store the elements of second araay into resultant array
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        for (int i = 0; i < length; i++)
            System.out.print(arr3[i] + " ");

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (arr3[i] > arr3[j]) {
                    ass = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = ass;
                }

            }
        }
        System.out.println("ascnding order");
        for (int i = 0; i < length; i++) {
            System.out.print(arr3[i] + " ");
        }

    }

}
