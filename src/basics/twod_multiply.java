import java.util.Scanner;

public class twod_multiply {
    public static void main(String[] args) {
        int i, j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter Number of elements in a row for 1st array: ");
        int row1 = sc.nextInt();
        System.out.println(" Please Enter Number of elements in a column for 1st array : ");
        int col1 = sc.nextInt();
        System.out.println(" Please Enter all the elements of rows and columns: ");

        int ar[][] = new int[row1][col1];

        for (i = 0; i < row1; i++) {
            for (j = 0; j < col1; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        int row2, col2;
        System.out.println(" Please Enter Number of elements in a row for 2nd array: ");
        row2 = sc.nextInt();
        System.out.println(" Please Enter Number of elements in a column for 2nd array : ");
        col2 = sc.nextInt();

        System.out.println(" Please Enter all the elements of rows and columns : ");

        int arr[][] = new int[row2][col2];

        for (int k = 0; k < row2; k++) {
            for (int l = 0; l < col2; l++) {
                arr[k][l] = sc.nextInt();
            }
        }

        System.out.println(" First Matrix is : ");

        for (i = 0; i < row1; i++) {
            for (j = 0; j < col1; j++) {
                System.out.print(ar[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println(" Second Matrix are : ");

        for (i = 0; i < row2; i++) {
            for (j = 0; j < col2; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int mul = 0;
        if (row1 != col2) {
            System.out.println(" Matrix multiplication cannot be done ");
        } else {
            int[][] result = new int[row1][col2];
            for (i = 0; i < row1; i++) {
                for (j = 0; j < col2; j++) {
                    for (int k=0;k < row2;k++ )
                        result[i][j]= result[i][j] + ar[i][k] * arr[k][j];
                }
            }
            System.out.println("Product of the matrices");
            for (int h = 0; h<row1;h++){
                for (int u = 0;u<col2;u++)
                    System.out.print(result[h][u] + "\t");
                System.out.println("");
            }
        }
    }
}
