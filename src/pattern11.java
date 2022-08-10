public class pattern11 {
    public static void main(String[] args) {
        int n=6;
        int b=8;

        for (int i=0;i<1;i++){
            for (int j=0;j<=n;j++){
            System.out.print(" " +"*");}
        }
        System.out.println();

        for (int i=1;i<n;i++){
            for(int j=1;j<b;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i=0;i<1;i++){
            for (int j=0;j<=n;j++){
                System.out.print(" " + "*");}
        }

    }
}
