import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float a, b;
        String c;
        System.out.println("Enter 1st number");
        a = sc.nextFloat();
        System.out.println("Enter 2nd number");
        b = sc.nextFloat();
        System.out.println("Enter the operation you want to perform: (+ , - , * , % , /)");
        c = sc.next();
        switch (c) {
            case "+" -> System.out.println("The sum is = " + (a + b));
            case "-" -> System.out.println("The diff is = " + (a - b));
            case "*" -> System.out.println("The product is = " + (a * b));
            case "%" -> System.out.println("The mod is = " + (a % b));
            case "/" -> System.out.println("The division is = " + (a / b));
            default -> System.out.println("Enter a relevant operator");
        }
    }

}
