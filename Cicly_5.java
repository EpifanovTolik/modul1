package by.tolikonline.smolyakova_lekt.zadachi;

// 5. Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых больше или равен числу e.
//    Общий член ряда имеет вид: An = 1/(2^n)+1/(3^n)

public class Cicly_5 {

    public static void main(String[] args) {


        double e = 0.1;

        double n = 7;  //количесвто чисел
        double st = 0;  // энный член ряда
        double k = 0;   //начало сложения чисел с нуля

        for (int i=1; i<n; i++){
            st = i;
            st = 1/(Math.pow(2, st ))+1/(Math.pow(3, st));
 //               st = 1*(Math.pow(2, st ));                    эта формула проще, делал для понимания
            System.out.println( "энный член равен " + st);

            if (Math.abs(st)>= e){
                    k = k + st;
                System.out.println("сумма энных членов " + k);
                }

            }
        System.out.println("сумма энных членов итог " + k);

    }
}
