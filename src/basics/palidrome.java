package basics;

import java.util.Scanner;

public class palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int rem = 0;
        System.out.println("enter a number");
        a = sc.nextInt();
        int b=a;

        while (a != 0) {
            int r = a % 10;
            rem = rem * 10 + r;
            a = a / 10;
        }
         if (rem==b){
             System.out.println( rem +  " it is palidrome");}
         else {
             System.out.println( rem + " not a palidrome");
         }
    }
}
