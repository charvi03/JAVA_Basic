public class pattern13 {
    public static void main(String[] args) {

        for (int i = 0;i<5; i++){
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0;i<3;i++){
            System.out.print("*");
            for (int j=0;j<4;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0;i<5; i++){
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0;i<3; i++){
            System.out.print("*");
            for (int j =0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }


    }
}
