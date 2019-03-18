package edu.hillel.homework;

import java.util.Random;
import java.util.SortedMap;

public class Array {

    /*1) - Создать массив элементов от 0 до 100;
         - заполнить его случайными числами от 100 до 10 000
         - определить максимальное и минимальное число в массиве*/

    private Random random = new Random();

    private int[] array;

    private int minInt;
    private int maxInt;
    private int arrayLenght;

    private int minValueArray;
    private int maxValueArray;

    public void showArray(int minInt, int maxInt, int arrayLenght) {
        array = new int[arrayLenght];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxInt - minInt) + minInt;
            System.out.println(array[i]);

            if (i == 0 || minValueArray > array[i]) {
                minValueArray = array[i];
            }
            if (i == 0 || maxValueArray < array[i]) {
                maxValueArray = array[i];
            }
        }
        System.out.println("min " + minValueArray + "; max " + maxValueArray);
    }
}