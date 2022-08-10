import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;
        System.out.println("Quiz game choose any one form 1,2,3,4 for your correct ans");
        System.out.println("Q1:- which is not vowel from all these");
        System.out.println("1: a");
        System.out.println("2: e");
        System.out.println("3: p");
        System.out.println("4: i");
        a = sc.nextInt();

        if (a == 3) {
            System.out.println("Q2:- who is the prime minister of india");
            System.out.println("1: Narinder modi");
            System.out.println("2: kejriwal");
            System.out.println("3: trumph");
            System.out.println("4: Taau");
            b = sc.nextInt();
            if (b == 1) {
                System.out.println("Q3:- when was charvi came on earth");
                System.out.println("1: 1 oct");
                System.out.println("2: 3 oct");
                System.out.println("3: 15 june");
                System.out.println("4: 29 feb");
                c = sc.nextInt();
                if (c == 2) {
                    System.out.println("Q4:- who is more shaitan?");
                    System.out.println("1: charvi");
                    System.out.println("2: nandni");
                    System.out.println("3: esha");
                    System.out.println("4: Mehak");
                    d = sc.nextInt();
                    if (d == 1) {
                        System.out.println("You won the game hurray!");
                    } else {
                        System.out.println("You are out!");
                    }
                } else {
                    System.out.println("You are out!");
                }
            } else {
                System.out.println("You are out!");
            }

        } else {
            System.out.println("You are out!");
        }
    }
}