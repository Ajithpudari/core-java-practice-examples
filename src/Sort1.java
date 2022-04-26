import java.util.Arrays;

public class Sort1 {
    public static int[] sortArrays(int[] arr)
    {
        int length = arr.length;
        for (int j = 0; j < length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j = -1;
            }
        }

        return arr;
    }


    public static void main(String args[])
    {
        int arr[] = {14, 12, 70, 15, 99, 65, 21, 90};

        System.out.println("array: "+ Arrays.toString(arr));
       int[] arr1 = sortArrays(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr1));
    }
}
