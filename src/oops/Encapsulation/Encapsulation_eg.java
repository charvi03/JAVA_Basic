package oops.Encapsulation;

public class Encapsulation_eg {
    public static void main(String[] args) {
        A ob = new A();
        ob.set();
        ob.get();

    }
}
class A {
    private int a;
    void set(){
        a=10;
    }
    void get(){
        System.out.println(a);
    }
}

//Encapsulation it has two thing - > 1. Access specifiers 2. Packages

//Access Specifiers
//1. public -> access from anywhere for eg public int a;
//2. protected -> accessible to child class only
//3. private -> accessible to class only
//4. default -> public
