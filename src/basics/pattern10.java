public class pattern10 {
    public static void main(String[] args) {
        /* int n=8;
        int a=0;
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j=0;j<=n;j++){
                if (j==n){
                    System.out.print("*");
                }
                else if(j==a){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            a++;
            System.out.println();


        }*/

        for (int i = 0; i < 7; i++) {
            System.out.print("*");
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

           for (int k=6;k>=i;k--){
               System.out.print(" ");
           }
            System.out.println("*");
        }

    }
}


