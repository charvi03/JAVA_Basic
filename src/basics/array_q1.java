package basics;

public class array_q1 {
    public static void main(String[] args) {
        //question1 -- sum of marks
        float[] marks = {45.7f, 67.8f,63.4f,99.2f,100.0f};
        float sum=0;
        for (float i:marks){
            sum=sum+i;
        }
        System.out.println(" the sum is =" + sum);
    }
}
