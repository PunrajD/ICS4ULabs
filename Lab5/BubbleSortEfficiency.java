import java.util.Random;

public class BubbleSortEfficiency {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 5000};

        for (int size : sizes) {
            int[] array = generateRandomArray(size);

            long startTime = System.nanoTime();
            bubbleSort(array);
            long endTime = System.nanoTime();

            long duration = endTime - startTime;
            System.out.println("Bubble sort on " + size + " elements took " + duration + " ns (" + (duration / 1_000_000.0) + " ms)");
        }

        System.out.println("Bubble sort is O(n^2), so time increases quadratically with array size, making it inefficient for large arrays.");
    }

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10000);
        }
        return array;
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}