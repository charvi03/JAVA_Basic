package basics;

public class greatest_array {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 9, 6, 1};
        int greatest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (greatest < arr[i]) {
                greatest = arr[i];
            }

        }
        System.out.println("greatest element is  " + greatest);
    }
}
