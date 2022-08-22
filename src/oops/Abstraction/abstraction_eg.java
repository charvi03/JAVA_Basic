package oops.Abstraction;

public class abstraction_eg {
    public static void main(String[] args) {
        B o = new B();
        o.show();
        o.display();

    }
}

abstract class A{
    int a= 10;
    void show(){
        System.out.println("Hello");
    }
}
class B extends A{
    void display(){
        System.out.println(a);
    }
}

//Abstraction = hiding the class

//abstract class Bank-> amt=100000 abstract fun getInterst();
//class HDFC -> amt+7% print
//class SBi -> amt+6% pribt
//pnb -> amt +8% print
//main