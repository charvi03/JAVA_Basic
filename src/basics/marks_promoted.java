package basics;

import java.util.Scanner;

public class marks_promoted {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your accountancy marks");
        m1=scanner.nextByte();
        System.out.println("Enter your economics marks");
        m2=scanner.nextByte();
        System.out.println("Enter your business studies marks");
        m3=scanner.nextByte();
        float avg= (m1+m2+m3)/3.0f;
        System.out.println("This your is your overall percentage =" +avg +"%");
        if (avg>=44 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("You are promoted");
        } else{
            System.out.println("You are not promoted");
        }
    }
}
