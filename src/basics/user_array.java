package basics;

import java.util.Scanner;

public class user_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("Enter number of elements");
        a= sc.nextInt();
        int [] arr= new int[a];
        System.out.println("Enter the elements");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
            System.out.println(arr[i]);
        }
    }
}
