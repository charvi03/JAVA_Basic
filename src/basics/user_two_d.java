import java.util.Scanner;

public class user_two_d {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter Number of elements in a row for 1st array: ");
        int Sizer = sc.nextInt();
        System.out.println(" Please Enter Number of elements in a coulmn for 1st array : ");
        int Sizec = sc.nextInt();
        System.out.println(" Please Enter all the elements of rows and coulmns : ");

        int[][] ar = new int[Sizer][Sizec];

        for (i = 0; i < Sizer; i++) {
            for (j = 0; j < Sizec; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        int Sizer2, Sizec2, k, l = 0;
        System.out.println(" Please Enter Number of elements in a row for 2nd array: ");
        Sizer2 = sc.nextInt();
        System.out.println(" Please Enter Number of elements in a coulmn for 2nd array : ");
        Sizec2 = sc.nextInt();

        System.out.println(" Please Enter all the elements of rows and coulmns : ");

        int[][] arr = new int[Sizer2][Sizec2];

        for (k = 0; k < Sizer2; k++) {
            for (l = 0; l < Sizec2; l++) {
                arr[k][l] = sc.nextInt();
            }
        }

        System.out.println(" First Matrix is : ");

        for (i = 0; i < Sizer; i++) {
            for (j = 0; j < Sizec; j++) {
                System.out.print(ar[i][j] + "\t");

            }
            System.out.println();
        }

        System.out.println(" Second Matrix are : ");

        for (i = 0; i < Sizer2; i++) {
            for (j = 0; j < Sizec2; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
