import java.util.Scanner;

public class factorial_for {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        int j=1;
        System.out.println("enter a number");
        a=sc.nextInt();
        for (int i=1;i<=a;i++){    // 1*2*3*4 i*i+1*i+2
            j=j*i;

        }
        System.out.println("the factorial is  " + j);
    }
}
