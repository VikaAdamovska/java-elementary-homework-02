package edu.hillel.homework;

public class Factorial {

    /* - Создать переменную int var,
      - Заполнить любым целым числом от 1 до 10
      - С помощью циклов for, while, do while реализовать вычисление факториала от числа:
      - пример факториала от int var = 6; 6 * 5 * 4 * 3 * 2 * 1;*/

    private int var;

    private int randomMin;
    private int randomMax;


    public void showVar(int randomMin, int randomMax) {
        var = (int) ((Math.random() * (randomMax - randomMin)) + randomMin);
    }

    public void showFactorialWithFor() {
        int factorial = 1;
        for (int i = 1; i <= this.var; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial " + var + " with for is " + factorial);
    }

    public void showFactorialWithWhile() {
        int factorial = 1;
        int count = 1;

        while (this.var >= count) {
            factorial = factorial * count;
            count++;
        }

        System.out.println("Factorial " + var + " with while is " + factorial);
    }

    public void showFactorialWithDoWhile() {
        int factorial = 1;
        int count = 1;

        do {
            factorial = factorial * count;
            count++;
        } while (var >= count);

        System.out.println("Factorial " + var + " with do while is " + factorial);
    }

}
