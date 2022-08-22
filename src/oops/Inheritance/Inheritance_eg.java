package oops.Inheritance;

public class Inheritance_eg {
    public static void main(String[] args) {
        B object = new B();
        object.info();
        object.display();

        object.a = 234;
        object.b = 24334;
        object.display();

    }


}

class A{ //parent class
    int a;
    int b;
}

class B extends A { //this is child class called B nd it is Depend on parent class called A
    void info(){
        a=45;
        b=60;
    }

    void display(){
        System.out.println("A " +a);
        System.out.println("B " +b);
    }
}
//parent -> info (getname,getphoneno) -> MArks (5 sub marks form user) -> grades (total, %age, 0<30 grade D,30<50 grade C, <80 grade B ,100 grade A)


