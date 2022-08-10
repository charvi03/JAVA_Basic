import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);
        int a;
        int b=1;
        System.out.println("Enter a number ");
        a=sc.nextInt();
        while (b<=10){
             System.out.println( a + "X" + b + "=" + (a*b));
             b++;

         }

    }
}
