package HomeWork8.Exercise1Sort;

import java.util.List;

public class CoctailSort {

    public static void doCoctailSort(int[] array) {
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

    public static void doCoctailSort(List<Integer> array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= array.size() - 2; i++) {
                if (array.get(i) > array.get(i+1)) {
                    //test whether the two elements are in the wrong order
                    int temp = array.get(i);
                    array.set(i, array.get(i+1));
                    array.set(i+1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                //we can exit the outer loop here if no swaps occurred.
                break;
            }
            swapped = false;
            for (int i = array.size() - 2; i >= 0; i--) {
                if (array.get(i) > array.get(i+1)) {
                    int temp = array.get(i);
                    array.set(i, array.get(i+1));
                    array.set(i+1, temp);
                    swapped = true;
                }
            }
            //if no elements have been swapped, then the list is sorted
        } while (swapped);
        System.out.println("Сортировка смешиванием:");
        for (int i : array) System.out.print(i + " ");
    }

}
