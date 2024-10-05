public class declareArray {
    public static void main(String[] args) {
        int[] a = { 2, 3, 6, 5 };
        int[] b = { 5, 6, 9, 8 };

        // You cannot compare arrays using the < operator
        // Instead, you can compare the sum of elements or individual elements
        int sumA = 0;
        int sumB = 0;
        for (int i : a) {
            sumA += i;
        }
        for (int i : b) {
            sumB += i;
        }

        if (sumA < sumB) {
            System.out.println("a is smaller");
        } else {
            System.out.println("b is smaller");
        }
    }
}