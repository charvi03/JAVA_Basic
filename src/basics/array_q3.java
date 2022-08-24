package basics;

public class array_q3 {
    public static void main(String[] args) {
        //question3 average of marks
        float[] marks = {45,67,63,99,15};
        float sum=0;
        for (float i:marks){
            sum=sum+i;
        }
        System.out.println(" the sum is =" + sum/marks.length);
    }
}
