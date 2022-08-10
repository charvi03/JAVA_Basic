import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int principal;
        float rate ,time;

        System.out.println("Enter the principal amount");
        principal=scanner.nextInt();

        System.out.println("Enter the rate of interest");
        rate=scanner.nextFloat();

        System.out.println("Enter the time");
        time=scanner.nextFloat();

        float simple_interest=(principal*rate*time)/100;
        System.out.println("This is calculated interest = "+ simple_interest);
    }
}
