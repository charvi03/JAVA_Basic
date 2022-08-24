package oops.Static;

public class this_super_keyword {
    public static void main(String[] args) {
        B o = new B();
        o.da(67);

    }
}
class A{
    int a = 10;
}
class B extends A{
    int a =  34;
    void da(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
