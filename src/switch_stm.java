public class switch_stm {
    public static void main(String[] args) {
        int a = 7;

        switch (a) {
            //new
            case 1 -> System.out.println("hello");
            case 5 -> System.out.println("hey");
            case 7 -> System.out.println("bye");
            default -> System.out.println("error");

            /* old
            case 1:
                System.out.println("hello");
                break;
            case 5:
                System.out.println("hey");
                break;
            case 7:
                System.out.println("bye");
                break;
            default:
                System.out.println("error");*/
        }
    }
}

//Q1 find the greatest number b/w two
//Q2 check if person is elegible for vote or not

