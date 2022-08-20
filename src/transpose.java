public class transpose {
    public static void main(String[] args) {
        int[][] arr1={
                {1,2,3},
                {4,5,6}
        };
        int[][] result = new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                result[i][j]=arr1[j][i];
            }
        }
        for (int i=0;i<3;i++){
         for (int j=0;j<2;j++){
             System.out.print(result[i][j] + " ");
         }
            System.out.println();
     }
    }

}
