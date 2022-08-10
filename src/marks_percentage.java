import java.util.Scanner;

public class marks_percentage {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        float sub1,sub2,sub3,sub4,sub5;

        System.out.println("Enter marks of Subject 1");
        sub1= scanner.nextFloat();

        System.out.println("Enter marks of Subject 2");
        sub2= scanner.nextFloat();

        System.out.println("Enter marks of Subject 3");
        sub3= scanner.nextFloat();

        System.out.println("Enter marks of Subject 4");
        sub4= scanner.nextFloat();

        System.out.println("Enter marks of Subject 5");
        sub5= scanner.nextFloat();

        float total_marks = sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total marks are = " + total_marks);

        float percentage= (total_marks/500)*100;
        System.out.println("percentage is = " + percentage + "%");
    }

}
