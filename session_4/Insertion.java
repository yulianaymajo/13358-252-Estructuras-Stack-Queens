import java.util.Arrays;

public class Insertion {

    public static void insertionSort(int[] A) {
        int N = A.length;
        int i = 1;

        while (i < N) {
            int currentElement = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > currentElement) {
                A[j + 1] = A[j];
                j = j - 1;
            }

            A[j + 1] = currentElement;
            i = i + 1;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 8, 9, 12, 3, 4};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
