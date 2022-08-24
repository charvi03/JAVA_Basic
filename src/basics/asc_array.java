package basics;

public class asc_array {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 9, 6, 1};
        int ass;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i;j<arr.length;j++)
                if (arr[i] > arr[j]){
                    ass = arr[i];
                    arr[i] = arr[j];
                    arr[j] = ass;
                }
        }
        System.out.println("Ascending order");
        for (int i = 0; i<arr.length;i++)
            System.out.print(arr[i]);

    }
}

