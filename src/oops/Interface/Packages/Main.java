package oops.Interface.Packages;
import oops.Interface.AccessModifiers.One;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number ");
        int a= sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("press 1 for addition ");
        System.out.println("press 2 for subtraction ");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division ");
        int c= sc.nextInt();
        One one= new One();
        switch (c){
            case 1:
                System.out.println("sum is " +one.sum(a,b));
                break;
            case 2:
                System.out.println("subtraction is " +one.sub(a,b));
                break;
            case 3:
                System.out.println("multiplication is " +one.multiply(a,b));
                break;
            case 4:
                System.out.println("division " +one.div(a,b));
                break;
        }


    }
}


