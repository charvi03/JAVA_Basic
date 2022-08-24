package oops.Interface.AccessModifiers;

public class Mulriple_interface {
    public static void main(String[] args) {
        C ob = new C();
        ob.set();
        ob.display();

    }
}
interface Ac{
    void set();
}
class B{
    int a,b;
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println("total " +(a+b));
    }
}
class C extends B implements Ac{
    @Override
    public void set() {
        a=20;
        b=30;
    }
}
