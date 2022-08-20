public class twod_asc {
    public static void main(String[] args) {
        int[][] mat1 = {
                {5, 3, 2},
                {9, 8, 3}
        };
        int ass;
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                for (int k = j; k < 3; k++) {
                    if (mat1[i][j] > mat1[i][k]) {
                        ass = mat1[i][j];
                        mat1[i][j] = mat1[i][k];
                        mat1[i][k] = ass;
                    }
                }
            }
        }
        System.out.println("Ascending order");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }


    }

}
