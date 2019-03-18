package edu.hillel.homework;

import java.util.Random;

public class ShowResults {

    public static void main(String[] args) {

        //Заполнение массива и определение максимального и минимального числа в этом массиве

        Array array = new Array();
        array.showArray(100, 10000, 100);


        //Заполнение переменной  var

        Factorial factorial = new Factorial();
        factorial.showVar(1,10);

        //Вычисление факториала от int var

        factorial.showFactorialWithFor();
        factorial.showFactorialWithWhile();
        factorial.showFactorialWithDoWhile();


        //Вывод прямоугольникoв на консоль

        Rectangle rectangle = new Rectangle();
        rectangle.showRectangle(10, 100);
        rectangle.showHollowRectangle(10, 100);









    }
}
