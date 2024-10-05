public class ArraySwapping{
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        System.out.println("Array after swapping: " + java.util.Arrays.toString(arr));

    }
}