package by.tolikonline.smolyakova_lekt.zadachi;

// 4 Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях). Поменять местами дробную и
// целую части чилса и вывести полученное значение числа.

public class Lineyn_4 {
    public static void main(String[] args) {

        double a = 888.999;
        double b = (a*1000)%1000 + (int)a/1000.0;
        System.out.println(b);


//        double x = 8.99;
//        double y = (x*100)%100 + (int)x/10.0;
//        System.out.println(y);

    }
}