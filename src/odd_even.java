import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int a;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();

        if (a%2==0){
            System.out.println("Number is even");

        }
        else {
            System.out.println("Number is odd");
        }
    }
}

//if more then 3000 -> 10% intrest and if less thne 3000 5% intrest
