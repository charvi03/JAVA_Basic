import java.util.Scanner;

public class dlt_array_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, del, count = 0;

        // taken size of an array from the user
        System.out.println("Please enter number of elements in an array");
        size = sc.nextInt();

        //taken elements of an array from the user
        int[] arr = new int[size];
        System.out.println("please enter" + size + "elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //printing the array which is entered by the user
        System.out.print("Your array is ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //which element we want to del
        System.out.println("enter element to delete");
        del = sc.nextInt();

        ///in for loop of i checking all array elements one by one
        for (int i = 0; i < size; i++) {
            //if array element is equals to del
            if (arr[i] == del) {
                //checking all the elements where del element is
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                count++;
            }
        }
        if (count == 0)
            System.out.println("Element not found");
        else {
            System.out.println("Element deleted successfully");
            System.out.println("Now the new array is");
            for (int i = 0; i < size - count; i++)
                System.out.print(arr[i] + " ");
        }
    }
}
