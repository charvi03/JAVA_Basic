import java.util.Scanner;

public class while_oddeven_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1,even = 0,odd = 0;

        while (b<=10){
            if (b%2==0){
                even++;
            }
            else {
                odd++;
            }
            b++;
        }
        System.out.println(even+ " is total even no");
        System.out.println(odd+ " is total odd no");

    }
}
