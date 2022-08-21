public class duplicate_array {
    public static void main(String[] args) {
        int[] arr= {3,1,10,3,15,6,15,17,1,9};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                   // System.out.println("duplicate array is = " + arr[j]);
                    System.out.print(arr[j] +" ");
                }
            }
        }
    }
}
