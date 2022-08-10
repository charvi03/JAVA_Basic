public class pattern11 {
    public static void main(String[] args) {
        int n=8;
        int m=6;
        for (int i=0;i<n;i++){
            System.out.print("*");
            for (int j=0;j<m;j++){
                if(i==0 || i==(n/2) && j<(m-1) ){
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
