import java.util.Scanner;

public class voting_check {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;

        System.out.println("enter your age");
        a=scanner.nextInt();

        if (a<18){
            System.out.println("not eligible for voting");
        }
        else{
            System.out.println("eligible for voting");
        }
    }
}
