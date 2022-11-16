package basics;

import java.util.Scanner;

public class two_arr_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size, size2;
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
        int length = arr1.length;
        int[] arr3 = new int[length];
        System.out.println("Sum of 2 arrays = ");
        for (int i=0;i<length;i++){
            arr3[i]=arr1[i]+ arr2[i];

            System.out.print(arr3[i] + " ");
        }


    }
}
