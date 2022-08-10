public class pattern7 {
    public static void main(String[] args) {
        for (int i=0;i<=2;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=3;k>=i;k--){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
