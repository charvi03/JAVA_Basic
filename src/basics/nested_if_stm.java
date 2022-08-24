package basics;

public class nested_if_stm {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        if (a<0){

            System.out.println("now we r in 1st if");

            if (b<5){
                System.out.println("b is less than 5");
            } else if (b < 8) {
                System.out.println("b is less than 8");
            }else {
                System.out.println("b is more then 5 or 8");
            }
        }
        else {
            System.out.println("hey i m in 2nd else block");
            if (b<5){
                System.out.println("b is less than 5");
            } else if (b < 8) {
                System.out.println("b is less than 8");
            }else {
                System.out.println("b is more then 5 or 8");
            }
        }
    }
}
