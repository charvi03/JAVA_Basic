package oops.Polymorphism;

public class polyhorphism_eg {
    public static void main(String[] args) {
        B ob = new B();
        ob.one(10,20);
        ob.one(10);

    }
}
class A{
    int a =  2;
    void one(int a){
        System.out.println("Charvi");
    }
    void one(int a ,int b){
        System.out.println(a+b);
    }
}
class B extends A{
    @Override
    void one(int a,int c) {
        System.out.println(a+c);
    }

    @Override
    void one(int a) {
        System.out.println(a);
    }
}

//2 diffrent classes depends on each other with same function's name is called overriding
//same class with same functions name with diffrent attributes is called overloading


/*
* Hotel ->var basicrent =2000  fun getRoom{hotel}
* AC -> fun getRoom -> basicrent + 1000 print{3000}
* NONAC - > fun getROom -> basicrent + 500 print = 2500
* main-> press 1 for ac 2 for non ac
* */

