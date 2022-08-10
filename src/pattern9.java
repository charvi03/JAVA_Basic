public class pattern9 {
    public static void main(String[] args) {
        for (int i=0;i<=3;i++){
            for (int j=3;j>=i;j--){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int k=0;k<=15;k++){
            System.out.print("*");
        }
        for (int i=0;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }


    }
}
