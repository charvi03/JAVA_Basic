import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a,b;

        System.out.println("Enter a 1st value");
        a = scanner.nextInt();
        System.out.println("Enter a 2nd value");
        b = scanner.nextInt();

        int c = a + b;
        System.out.println("sum = " + c);

    }
    /*
    int = nextInt()
    float = nextFloat();
    double = nextDouble();
    long = nextLong():
    short = nextShort();
    String = next(); for one word
    String = nextLine(); for multiple lines or words
    char = next.chatAt(0);

     */

    /*USer details
    *
    * Name->
    * AGe->
    * Phone no. ->
    * print
    * */
}
