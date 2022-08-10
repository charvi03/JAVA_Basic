import java.util.Scanner;

public class selection_process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;
        System.out.println("What is your age?");
        a = sc.nextInt();

        if (a >= 18) {
            System.out.println("Enter you GK marks");
            b = sc.nextInt();
            if (b >= 80) {
                System.out.println("What are your quantitative skills marks");
                c = sc.nextInt();
                if (c >= 80) {
                    System.out.println("What are your aptitude marks?");
                    d = sc.nextInt();
                    if (d >= 80) {
                        System.out.println("What are your Logical reasoning marks?");
                        e = sc.nextInt();
                        if (e >= 80) {
                            System.out.println("you are selected");
                        } else {
                            System.out.println("you are NOT selected");

                        }
                    } else {
                        System.out.println("you are NOT selected");
                    }
                } else {
                    System.out.println("you are NOT selected");
                }
            } else {
                System.out.println("you are NOT selected");
            }

        } else {
            System.out.println("you are NOT selected");
        }
    }


}
