package oops.ClasseObjectsFunctions;

import java.util.Scanner;

public class marks_perct {
    public static void main(String[] args) {
        Details details = new Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String n = sc.nextLine();
        System.out.println("enter your roll no.:");
        int r = sc.nextInt();
        System.out.println("Enter your board");
        String  bor=sc.next();

        System.out.println("Enter your maths marks");
        int sub1= sc.nextInt();
        System.out.println("Enter your acc marks");
        int sub2= sc.nextInt();
        System.out.println("Enter your IT marks");
        int sub3= sc.nextInt();
        System.out.println("Enter your eco marks");
        int sub4= sc.nextInt();
        System.out.println("Enter your mgt marks");
        int sub5= sc.nextInt();



        details.name(n);
        details.rollNo(r);
        details.board(bor);
        details.sub(sub1,sub2,sub3,sub4,sub5);

    }
}

class Details {
    Scanner scanner = new Scanner(System.in);
    double total;

    public void name(String n) {
        System.out.println("your name is " + n);

    }

    public void rollNo(int r) {
        System.out.println("your roll no is " + r);

    }

    public void board(String b) {
        System.out.println("The board is " + b);

    }

    public void sub(int sub1, int sub2, int sub3, int sub4, int sub5) {
        System.out.println("Your maths marks are " + sub1);
        System.out.println("Your acc marks are " + sub2);
        System.out.println("Your IT marks are " + sub3);
        System.out.println("Your eco marks are " + sub4);
        System.out.println("Your mgt marks are " + sub5);
        total=sub1+sub2+sub3+sub4+sub5;
        System.out.println("total marks are " + total);
        System.out.println("percentage is " + (total/500)*100 + "%");


    }

}
