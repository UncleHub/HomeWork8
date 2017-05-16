package HomeWork8.Exercise1Sort;

import java.util.ArrayList;
import java.util.List;

public class EntryPoint {
    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>();

        list.add((int) Math.round((Math.random() * 100)));//0
        list.add((int) Math.round((Math.random() * 100)));//1
        list.add((int) Math.round((Math.random() * 100)));//2
        list.add((int) Math.round((Math.random() * 100)));//3
        list.add((int) Math.round((Math.random() * 100)));//4
        list.add((int) Math.round((Math.random() * 100)));//5
        list.add((int) Math.round((Math.random() * 100)));//6
        list.add((int) Math.round((Math.random() * 100)));//7
        list.add((int) Math.round((Math.random() * 100)));//8
        list.add((int) Math.round((Math.random() * 100)));//9
        System.out.println("Первоначальная коллекция:");
        for (int l : list){
            System.out.print(l+" ");
        }

        Integer[] array = list.toArray(new Integer[list.size()]);
        int [] result = new int[array.length];
        for (int i = 0; i < result.length; i++)
            result[i] = array[i];
        System.out.println("\n");

        CoctailSort a = new CoctailSort();
        a.doCoctailSort(result);
        System.out.println("\n");

        InsertIntoSort b = new InsertIntoSort();
        b.doInsertIntoSort(result);

    }

}



