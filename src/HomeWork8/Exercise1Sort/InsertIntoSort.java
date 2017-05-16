package HomeWork8.Exercise1Sort;


public class InsertIntoSort {

    public static void doInsertIntoSort(int[] array) {
        int temp, j;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
        System.out.println("Сортировка вставками, в обратную сторону:");
        for (int i = (array.length-1); i >= 0 ; i--) {
            System.out.print(array[i]+" ");
        }
    }
}