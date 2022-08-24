package oops.Encapsulation;

public class encapsulation_private_protected {
    public static void main(String[] args) {
        F ob = new F();
        ob.set();
        ob.setData();
        ob.display();

    }
}
class D{
    private int a;
    protected int b;
    void set(){
        a=10;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
}
class F extends D{
    void setData(){
        b=23;
    }
}
