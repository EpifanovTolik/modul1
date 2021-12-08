package by.tolikonline.smolyakova_lekt.zadachi;

// 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1
//  до введенного пользователем числа.

import java.util.Scanner;

public class Cicly_1 {

    private static int scannerInt() {

       Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        int f = in.nextInt();


        while (f <= 0) {
            System.out.println("ввели отриц число или 0 ");
            return scannerInt();
        }
        return f;
    }
    public static void main(String[] args) {

            int x = scannerInt();
            int z = 0;

            for (int y = 1; y <= x; y++) {
                z = z + y;

            }
            System.out.println(z);
        }
}

