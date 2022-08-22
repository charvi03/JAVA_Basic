package oops.Polymorphism;

import java.util.Scanner;

public class hotel_room {
    public static void main(String[] args) {
        NonAc obj= new NonAc();
        Ac obj2 = new Ac();
        Scanner sc= new Scanner(System.in);
        System.out.println("Press 1 to show ac rent ");
        System.out.println("Press 2 to show non ac rent ");
        int c=sc.nextInt();
        switch (c){
            case 1:
                obj2.getRoom();
                break;
            case 2:
                obj.getRoom();
                break;
        }

    }
}
class Hotel{
    int basic=2000;
     void getRoom(){
         System.out.println(basic);
     }
}
class Ac extends Hotel{
    @Override
    void getRoom() {
        int ac=basic+1000;
        System.out.println("ac room rent is = "+ac);
    }
}
class NonAc extends Ac{
    @Override
    void getRoom() {
        int non=basic+500;
        System.out.println("non ac room rent is " +non );
    }
}