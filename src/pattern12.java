public class pattern12 {
    public static void main(String[] args) {
        int n=6;

        for (int i=0;i<1;i++){
            for (int j=0;j<=n;j++){
                System.out.print("*");}
        }
        System.out.println();
        for (int i=0;i<=3;i++){
            for (int j=3;j>=i;j--){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i=0;i<1;i++){
            for (int j=0;j<=n;j++){
                System.out.print( "*");}
        }
    }
}
