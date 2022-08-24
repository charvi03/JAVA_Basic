package oops.WrapperClass;

public class wrapper {
    public static void main(String[] args) {
        String a = "1234";
        System.out.println(Integer.parseInt(a));
        System.out.println(Float.parseFloat(a));
        System.out.println(a.charAt(3));

        int b = 2456;
        System.out.println(String.valueOf(b));
    }
}
