package oops.Interface.AccessModifiers;

public class interface_eg {
    public static void main(String[] args) {
        A ob = new A();
        ob.show("Charvi");

    }
}

interface AB{
    void show(String name);
}
class A implements AB{

    @Override
    public void show(String name) {
        System.out.println("Hey " + name);
    }
}

