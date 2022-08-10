import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class reversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int rem = 0;
        System.out.println("enter a number");
        a = sc.nextInt(); // 1234 - 4321

        while (a != 0) {  //1234 , 123 , 12 , 1, 0--false
            int r = a % 10;  //r=4 , r=3 , r=2 , r=1
            rem = rem * 10 + r; //rem == 0*10 + 4= 4, 4*10 + 3=43 , 43*10 + 2=432 , 432*10 + 1 =4321
            a = a / 10; //1234/10=123 -- a=123,  123/10= 12 , 12/10= 1, 1/10 =0.


        }
        System.out.println("reverse is = " + rem);//false- print
    }
}
