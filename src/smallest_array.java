public class smallest_array {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 9, 6, 1};
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }

        }
        System.out.println("smallest element is  " + smallest);
    }
}
