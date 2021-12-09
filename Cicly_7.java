package by.tolikonline.smolyakova_lekt.zadachi;

// 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//    m и n вводятся с клавиатуры

import java.util.Scanner;

public class Cicly_7 {

    private static int scannerInt1() {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("введите число m:");
        number = in.nextInt();
        return number;
    }

    private static int scannerInt2() {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("введите число n:");
        number = in.nextInt();
        return number;
    }

    public static void main(String[] args) {


        int m = scannerInt1();
        int n = scannerInt2();

//        int m = 10;
//        int n = 20;
        int x;          //число в промежутке
        int y;
        for (int i = m; i<=n; i++){
            x=i;
            System.out.println("число в промежутке: " + x);

            for (int j=2; j<n; j++){
                if (x%j==0 && j!=x){
                    y=j;
                    System.out.println("делитель для данного числа: " + y);
                }
            }

        }


    }

}
