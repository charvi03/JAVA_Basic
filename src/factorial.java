import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        int i= 1;
        int j=1;
        System.out.println("Enter a number for factorial");
        a=sc.nextInt();
         while (i<=a) {
             //1 -- 4  = 1*2*3*4  i*i+1*i+2....
             j=j*i; //j = 1 * 1 , j = 1 * 2 =2 , j = 2 * 3 = 6, j = 6 * 4 = 24 , j = 24 * 5 = 120
             i++; //5
         }
        System.out.println("Factorial of "+ a + "is " +j);
    }
}
