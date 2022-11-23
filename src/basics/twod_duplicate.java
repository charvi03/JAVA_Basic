package basics;

public class twod_duplicate {
    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] mat2 = {
                {2, 6, 13},
                {3, 7, 1}
        };
        System.out.println("first matrix");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("second matrix");

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("common elements : ");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = i+1; j < mat1[i].length; j++) {
                for (int k=0;k< mat2.length;k++){
                    for (int l=0;l< mat2.length;l++){
                        if (mat1[i][j]==mat2[k][l]){
                            System.out.print(mat1[i][j] +" ");
                        }
                    }

                }


            }
        }
    }
}
