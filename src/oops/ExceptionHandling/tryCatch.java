package oops.ExceptionHandling;

import static oops.Static.finalKeyword.hello;

public class tryCatch {
    public static void main(String[] args) {
        int hello1 = hello;

        try {
            System.out.println(hello1);
        }catch (Exception e){
            System.out.println(e);
        }finally {

        }
    }
}
