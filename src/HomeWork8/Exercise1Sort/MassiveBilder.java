package HomeWork8.Exercise1Sort;

import java.util.List;


public class MassiveBilder {
    public static void doMassiveBilder(List<Integer> list){

        Integer[] array = list.toArray(new Integer[list.size()]);
        int [] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }
        System.out.println("Коллекция преобразованная в массив:\n");
        for (int i :
                result) {
            System.out.print(i+" ");
        }

    }
}
