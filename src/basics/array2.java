package basics;

public class array2 {
    public static void main(String[] args) {

        //String[] students={"abc","pqr","efg"};
        int[] marks = {100, 40, 60, 80, 90};
//        System.out.println(marks.length); --5
        //1.display using for loop--
       /* for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }*/
         //2. using for each loop
        for (int element : marks){
            System.out.println(element);
        }

    }
}
