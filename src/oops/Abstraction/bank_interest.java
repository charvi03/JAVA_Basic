package oops.Abstraction;

public class bank_interest {
    public static void main(String[] args) {
        Hdfc obj1=new Hdfc();
        Sbi obj2=new Sbi();
        Pnb obj3=new Pnb();
        obj1.getInterest();
        obj2.getInterest();
        obj3.getInterest();
    }
}

abstract class Bank {
    int amt = 100000;

    abstract void getInterest();
}

class Hdfc extends Bank {
    double b = (amt * 7) / 100;

    void getInterest() {
        System.out.println("interest is " + b);
        System.out.println("Amount  is " + (amt + b));

    }
}

class Sbi extends Hdfc {
    double c = (amt * 6) / 100;

    void getInterest() {
        System.out.println("interest is " + c);
        System.out.println("amount is " + (amt + c));
    }
}

class Pnb extends Sbi {
    double d = (amt * 8) / 100;

    @Override
    void getInterest() {
        System.out.println("interest is " + d);
        System.out.println("amount is " + (amt + d));
    }
}

