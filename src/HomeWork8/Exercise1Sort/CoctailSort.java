package HomeWork8.Exercise1Sort;

public class CoctailSort {

    public static void doCoctailSort(int[] array){
        int left = 0;
        int right = array.length - 1;

        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] ^= array[i + 1];
                    array[i + 1] ^= array[i];
                    array[i] ^= array[i + 1];
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    array[i] ^= array[i - 1];
                    array[i - 1] ^= array[i];
                    array[i] ^= array[i - 1];
                }
            }
            left++;
        } while (left <= right);

        System.out.println("Сортировка смешиванием:");
        for (int i : array) System.out.print(i + " ");

    }
}

