package oops.Inheritance;

import java.util.Scanner;

public class inheritance_marks {
    public static void main(String[] args) {
        Grades grades=new Grades();
        grades.getName();
        grades.getPh();
        grades.marks();
        grades.percentage();
        grades.grades();

    }
}

class Info {
    String name;
    int rollno;
    Long ph;
    Scanner sc = new Scanner(System.in);

    void getName() {
        System.out.println("Enter your name");
        name = sc.next();
        System.out.println("Enter your rollno");
        rollno = sc.nextInt();
    }
    void getPh() {
        System.out.println("Enter phone number");
        ph = sc.nextLong();
    }
}

class Marks extends Info {
    int sub1, sub2, sub3, sub4, sub5;

    void marks() {
        System.out.println("Enter you subject 1 marks");
        sub1 = sc.nextInt();
        System.out.println("Enter subject 2 marks ");
        sub2 = sc.nextInt();
        System.out.println("Enter subject 3 marks");
        sub3 = sc.nextInt();
        System.out.println("Enter subject 4 marks");
        sub4 = sc.nextInt();
        System.out.println("Enter subject 5 marks");
        sub5 = sc.nextInt();

    }
}

class Grades extends Marks {
    double total ;
    double per;

    void percentage() {
        total =sub1 + sub2 + sub3 + sub4 + sub5;
        per = (total / 500) * 100;
    }

    void grades() {
        System.out.println("name is " + name);
        System.out.println("rollno is " + rollno);
        System.out.println("phone numbr " + ph);
        System.out.println("total marks are : " + total);
        System.out.println("percentage is : " + per + "%");

        if (per <= 30) {
            System.out.println("grade is D");
        } else if (per <= 50) {
            System.out.println("grade is C");
        } else if (per <= 80) {
            System.out.println("grade is B");

        } else {
            System.out.println("grade is A");
        }
    }
}
