import java.util.Scanner;

public class days_of_week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number to display day of week");
        a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("it is sunday");
                break;
            case 2:
                System.out.println("it is monday");
                break;
            case 3:
                System.out.println("it is tuesday");
                break;
            case 4:
                System.out.println("it is wednesday");
                break;
            case 5:
                System.out.println("it is thursday");
                break;
            case 6:
                System.out.println("it is friday");
                break;
            case 7:
                System.out.println("it is saturday");
                break;
            default:
                System.out.println("there are only seven days of week");
        }
    }
}
