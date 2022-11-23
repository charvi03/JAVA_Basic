package basics;

public class two_array {
    public static void main(String[] args) {
        int []arr1={2,3,4,5};
        int[]arr2={6,7,8,9};
        int[] result=new int[arr1.length];
        for (int i=0;i<result.length;i++){
            result[i]=arr1[i]+ arr2[i];
            System.out.print(result[i]+ " ");
        }

    }
}
