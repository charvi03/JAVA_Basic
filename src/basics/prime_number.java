import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b=2;

        System.out.println("enter a number to check prime");
        a = scanner.nextInt();


        while (b<=a/2){
            if (a % b == 1)// 3 = 3/3 and 3/1
                System.out.println("it is prime");
            else System.out.println("not a prime");
            b++;
        }
    }
}

