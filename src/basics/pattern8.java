package basics;

public class pattern8 {
    public static void main(String[] args) {
        for (int i=0;i<=3;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=3;k>=i;k--){
                System.out.print("*");
            }
            for(int l=2;l>=i;l--){
                System.out.print("*");
            }


            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
