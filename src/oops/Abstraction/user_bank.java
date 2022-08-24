package oops.Abstraction;

import java.util.Scanner;

public class user_bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount of deposit ");
        int amt = sc.nextInt();
        HdfcBank obj1 = new HdfcBank();
        SbiBank obj2 = new SbiBank();
        PnbBank obj3 = new PnbBank();
        System.out.println("press 1 for hdfc bank ");
        System.out.println("press 2 for sbi bank ");
        System.out.println("press 3 for pnb bank ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                obj1.getInterest(amt);
                break;
            case 2:
                obj2.getInterest(amt);
                break;

            case 3:
                obj3.getInterest(amt);

        }


    }
}

abstract class MyBank {
    double intrest;
   abstract void getInterest(int amount);

}

class HdfcBank extends MyBank {

    void getInterest(int amount) {
        intrest = (amount * 7) / 100;
        System.out.println("Interest on deposit is  " + intrest);
        System.out.println(" Total Amount  is " + (amount + intrest));

    }

}

class SbiBank extends HdfcBank {
    void getInterest(int amount) {
        intrest = (amount * 6) / 100;
        System.out.println("Interest on deposit is " + intrest);
        System.out.println(" Total Amount  is " + (amount + intrest));

    }

}

class PnbBank extends HdfcBank {
    void getInterest(int amount) {
        intrest = (amount * 8) / 100;
        System.out.println("Interest on deposit is " + intrest);
        System.out.println(" Total Amount  is " + (amount + intrest));

    }

}
