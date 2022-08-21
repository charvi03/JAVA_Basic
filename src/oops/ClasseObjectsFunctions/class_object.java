package oops.ClasseObjectsFunctions;

public class class_object {

        public static void main(String[] args) {
            car d = new car();
            System.out.println(d.sum(10,20));

        }
    }
    class car {
        //function
        public int sum(int a ,int b) {
            // void-- no return we can write full code ex,sout if else,swtich..
            // datatype-- int,string,boolean,etc we can only return.
            return a+b;
        }
    }
//1. no returntype no argument
//2. with returntype no argument
//1. no returntype with argument
//1. with returntype with argument
