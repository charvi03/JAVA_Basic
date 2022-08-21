package oops.ClasseObjectsFunctions;

import java.util.Scanner;

public class calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Cal cal = new Cal();
            System.out.println("Enter first value");
            int a = scanner.nextInt();
            System.out.println("Enter Second value");
            int b = scanner.nextInt();
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for division");
            int c = scanner.nextInt();
            switch (c) {
                case 1:
                    cal.sum(a, b);
                    System.out.println("sum is " + cal.sum(a, b));
                    break;
                case 2:
                    cal.sub(a, b);
                    System.out.println("sub is " + cal.sub(a, b));
                    break;
                case 3:
                    cal.mul(a, b);
                    System.out.println("multiplication is " + cal.mul(a, b));
                    break;
                case 4:
                    cal.div(a, b);
                    System.out.println("division is " + cal.div(a, b));
                    break;
            }

        }
    }

    class Cal {
        public int sum(int a, int b) {
            return a + b;
        }

        public int sub(int a, int b) {
            return a - b;
        }

        public int div(int a, int b) {
            return a / b;
        }

        public int mul(int a, int b) {
            return a * b;
        }

    }

