import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int sum = 0;
        System.out.println("Enter a number");
        a= sc.nextInt();
        while (a!=0) {
            int digit = a % 10;
            sum = sum + digit;
            a = a / 10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}
