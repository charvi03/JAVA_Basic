import java.sql.SQLOutput;
import java.util.Scanner;

public class user_details {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        long phoneno;
        System.out.println("Enter your name");
        name= scanner.nextLine();
        System.out.println("Enter ypur age");
        age= scanner.nextInt();
        System.out.println("Enter your phone number");
        phoneno=scanner.nextLong();

        System.out.println( "the name is  = " + name);
        System.out.println( "the age is  = " + age);
        System.out.println( "the phone number is  = " + phoneno);

    }


}
