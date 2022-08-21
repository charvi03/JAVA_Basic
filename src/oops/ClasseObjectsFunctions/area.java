package oops.ClasseObjectsFunctions;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Shape sh = new Shape();
        Scanner sc = new Scanner(System.in);
        System.out.println("select the shape to calculate area:");
        System.out.println("1 for rectangle");
        System.out.println("2 for square");
        System.out.println("3 for circle");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("enter the length and breadth");
                int l, b;
                l = sc.nextInt();
                b = sc.nextInt();
                System.out.println(" area is " + sh.rectangle(l, b));
            case 2:
                System.out.println("enter the side of square");
                int a;
                a = sc.nextInt();
                System.out.println("area is " + sh.square(a));
            case 3:
                System.out.println("enter the radius of the circle ");
                double r;
                r = sc.nextDouble();
                System.out.println("area is " + sh.circle(r));
        }
    }
}

class Shape {
    public int rectangle(int l, int b) {
        return l * b;
    }

    public int square(int a) {
        return a * a;
    }

    public double circle(double r) {
        return 3.14 * r * r;
    }

}
// do with no returntype with argument okay?
// creare class -> take users name rollno board like cbse hbse then 5 subjects and calculate percentage
// nd call all the functions in main class

