public class MaxFinder {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 1};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Maximum value: " + max);
    }
}