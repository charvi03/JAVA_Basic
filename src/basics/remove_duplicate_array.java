public class remove_duplicate_array {
    public static void main(String[] args) {

        int[] arr = {15,4,3,9,1,10,15,1};
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
        int length = arr.length;
        length = removeDuplicateArray(arr, length);
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    System.out.print(arr[j] + " ");
                }

            }*/
    }

    private static int removeDuplicateArray(int[] arr, int length) {
        if (length == 0 || length == 1)
            return length;
        int[] temp = new int[length];
        int j = 0;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[length - 1];
        if (j >= 0) System.arraycopy(temp, 0, arr, 0, j);
        return j;
    }
}
