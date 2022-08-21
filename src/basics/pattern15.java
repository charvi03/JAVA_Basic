public class pattern15 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 4;j>i;j--){
                System.out.print(" ");
            }

            for (int a = 3;a>i;a--){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
