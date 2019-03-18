package edu.hillel.homework;

public class Rectangle {

    /*3) создать переменные int height; int width;
       - заполнить случайными числами от 10 до 100
       - вывести на консоль прямоугольник из символов '#' размером height X width
       Например height = 10, width = 20;*/

    private int minInt;
    private int maxInt;

    public void showRectangle(int minInt, int maxInt) {
        int height = (int) ((Math.random() * (maxInt - minInt)) + minInt);
        int width = (int) ((Math.random() * (maxInt - minInt)) + minInt);
        System.out.println("Height " + height);
        System.out.println("Width " + width);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
        /*4) Аналогично заданию 3 вывести "полый" прямоугольник
        Например height = 10, width = 20;*/


    public void showHollowRectangle(int minInt, int maxInt) {
        int height = (int) ((Math.random() * (maxInt - minInt)) + minInt);
        int width = (int) ((Math.random() * (maxInt - minInt)) + minInt);
        System.out.println("Height " + height);
        System.out.println("Width " + width);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    System.out.print("#");
                } else if (j == 0 || j == width - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}