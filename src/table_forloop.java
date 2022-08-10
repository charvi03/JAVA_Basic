import java.util.Scanner;

public class table_forloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("enter a number");
        a= sc.nextInt();

        for (int i = 1; i<=10;i++){
            System.out.println( a + "X" + i +  "=" + (a*i));
        }
    }
}
